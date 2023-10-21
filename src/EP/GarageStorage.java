package EP;

import java.util.Arrays;

public class GarageStorage extends StorageUnit {
    private final int maxTime = 5 * 365;
    public GarageStorage(String s, int[] ints, int i) {
        super(s, ints, i);
        super.unitType = UnitType.GARAGE;
    }

    @Override
    public String toString() {
        return "GarageStorage{" +
                "maxTime=" + maxTime +
                ", location='" + location + '\'' +
                ", dimension=" + Arrays.toString(dimension) +
                ", priceDay=" + priceDay +
                ", unitType=" + unitType +
                '}';
    }
}
