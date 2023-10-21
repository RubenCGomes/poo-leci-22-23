package EP;

public class WarehouseStorage extends StorageUnit {
    private final int maxTime = 10 * 365;
    public WarehouseStorage(String s, int[] ints, int i) {
        super(s, ints, i);
        super.unitType = UnitType.WAREHOUSE;
    }
}
