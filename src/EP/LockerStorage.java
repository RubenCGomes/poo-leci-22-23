package EP;

import java.util.Arrays;

public class LockerStorage extends StorageUnit {
    public LockerStorage(String s, int[] ints, int i) {
        super(s, ints, i);
        super.unitType = UnitType.LOCKER;
    }

    @Override
    public String toString() {
        return "LockerStorage{" +
                "location='" + location + '\'' +
                ", dimension=" + Arrays.toString(dimension) +
                ", priceDay=" + priceDay +
                ", unitType=" + unitType +
                '}';
    }
}
