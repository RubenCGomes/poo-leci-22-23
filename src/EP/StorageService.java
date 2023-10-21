package EP;

import java.time.LocalDate;
import java.util.*;

public class StorageService implements StorageServiceInterface {
    List<StorageUnit> storageUnits = new ArrayList<>();
    List<Client> clients = new ArrayList<>();
    Map<Client, Rental> rentals = new HashMap<>();
    String name; String location;

    public StorageService(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean registerClient(int nif, String name, ClientType clientType) {
        if (nif <= 0 || String.valueOf(nif).length() != 9) return false;
        clients.add(new Client(nif, name, clientType));
        return true;
    }

    @Override
    public Client getClient(int taxId) {
        for (Client client : clients) {
            if (client.getNif() == taxId)
                return client;
        }
        return null;
    }

    public void addStorageUnit(StorageUnit storageUnit) {
        storageUnits.add(storageUnit);
    }

    @Override
    public void addStorageUnits(Collection<StorageUnit> storageUnits) {
        this.storageUnits.addAll(storageUnits);
    }

    @Override
    public boolean checkAvailability(StorageUnit storageUnit, LocalDate startDate, LocalDate endDate) {
        for (Object key : rentals.keySet()) {
            Rental rental = rentals.get(key);

            if (!rental.getStorageUnit().equals(storageUnit)) continue;
            return rental.getStartDate().toEpochDay() <= startDate.toEpochDay() && rental.getFinishDate().toEpochDay() >= endDate.toEpochDay();
        }
        return false;
    }


    public boolean checkAvailabilityByDuration(StorageUnit storageUnit, LocalDate startDate, long duration) {
        for (Object key : rentals.keySet()) {
            Rental rental = rentals.get(key);

            if (!rental.getStorageUnit().equals(storageUnit)) continue;
            return rental.getStartDate().toEpochDay() <= startDate.toEpochDay() && rental.getFinishDate().toEpochDay() >= startDate.toEpochDay() + duration;
        }
        return false;
    }

    @Override
    public List<StorageUnit> findAvailableUnits(UnitType unitType, LocalDate fromDate, int duration, int[] minDimensions) {
        List<StorageUnit> available = new ArrayList<>();
        for (Object key : rentals.keySet()) {
            Rental storageUnit1 = rentals.get(key);
            if (!storageUnit1.getStorageUnit().getType().equals(unitType)) continue;
            if (checkAvailabilityByDuration(storageUnit1.getStorageUnit(), fromDate, fromDate.toEpochDay() + duration))
                available.add(storageUnit1.getStorageUnit());
        }
        return available;
    }

    @Override
    public boolean rentStorageUnit(Client client, StorageUnit unit, LocalDate startDate, int duration) {
        if (checkAvailabilityByDuration(unit, startDate, duration)){
            rentals.put(client, new Rental(unit, startDate, duration));
            return true;
        }
        else
            return false;
    }

    @Override
    public double calculateTotalCost(StorageUnit unit, int duration) {
        return unit.getPriceDay() * duration;
    }

    @Override
    public List<String> listRentals() {
        List<String> rent = new ArrayList<>();
        rentals.forEach((client, rental) -> rent.add(rental.toString()));
        return rent;
    }

    @Override
    public List<String> listRentals(UnitType unitType) {
        List<String> rent = new ArrayList<>();
        rentals.forEach((client, rental) -> {
            if (rental.getStorageUnit().getType().equals(unitType))
                rent.add(rental.toString());
        });
        return rent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StorageService that = (StorageService) o;
        return Objects.equals(name, that.name) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }

    public Map<Object, Object> getAvailableUnitsBySize(LocalDate of, int i) {
        return null;
    }

    @Override
    public String toString() {
        return "StorageService{" +
                "storageUnits=" + storageUnits +
                ", clients=" + clients +
                ", rentals=" + rentals +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
