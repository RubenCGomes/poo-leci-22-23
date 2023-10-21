package EP;

import java.util.Arrays;
import java.util.Objects;

public abstract class StorageUnit {
    String location;
    int [] dimension;
    double priceDay;
    UnitType unitType;

    public StorageUnit(String location, int[] dimension, double priceDay) {
        this.location = location;
        this.dimension = dimension;
        this.priceDay = priceDay;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int[] getDimension() {
        return dimension;
    }

    public void setDimension(int[] dimension) {
        this.dimension = dimension;
    }

    public double getPriceDay() {
        return priceDay;
    }

    public void setPriceDay(double priceDay) {
        this.priceDay = priceDay;
    }

    public UnitType getType() {
        return unitType;
    }

    public void setType(UnitType unitType) {
        this.unitType = unitType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StorageUnit that = (StorageUnit) o;
        return Double.compare(that.priceDay, priceDay) == 0 && Objects.equals(location, that.location) && Arrays.equals(dimension, that.dimension) && unitType == that.unitType;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(location, priceDay, unitType);
        result = 31 * result + Arrays.hashCode(dimension);
        return result;
    }

    @Override
    public String toString() {
        return "StorageUnit{" +
                "location='" + location + '\'' +
                ", dimension=" + Arrays.toString(dimension) +
                ", priceDay=" + priceDay +
                ", unitType=" + unitType +
                '}';
    }
}
