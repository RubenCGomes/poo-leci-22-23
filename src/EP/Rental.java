package EP;

import java.time.LocalDate;
import java.util.Objects;

public class Rental {
    LocalDate startDate; LocalDate finishDate; StorageUnit storageUnit;

    public Rental(StorageUnit storageUnit, LocalDate startDate, LocalDate finishDate) {
        this.storageUnit = storageUnit;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public Rental(StorageUnit storageUnit, LocalDate startDate, int duration) {
        this.startDate = startDate;
        this.storageUnit = storageUnit;
        this.finishDate = LocalDate.ofEpochDay(startDate.toEpochDay() + duration);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public StorageUnit getStorageUnit() {
        return storageUnit;
    }

    public void setStorageUnit(StorageUnit storageUnit) {
        this.storageUnit = storageUnit;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental rental = (Rental) o;
        return Objects.equals(startDate, rental.startDate) && Objects.equals(finishDate, rental.finishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, finishDate);
    }

    @Override
    public String toString() {
        return "Rental{" +
                "startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", storageUnit=" + storageUnit +
                '}';
    }
}
