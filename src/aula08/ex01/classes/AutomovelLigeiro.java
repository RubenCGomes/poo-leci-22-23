package aula08.ex01.classes;

import java.util.Objects;

public class AutomovelLigeiro extends Veiculo{
    String registration; String brand; String model; int power; String serialNum; int capacity;
    int distance; int total;

    public AutomovelLigeiro(String registration, String brand, String model, int power, String serialNum, int capacity){
        super(registration, brand, model, power);
        if (capacity > 0 && serialNum.length() > 0){
            this.serialNum = serialNum; this.capacity = capacity;
        }
    }


    /*getters*/
    public String getSerialNum(){return serialNum;}
    public int getCapacity(){return capacity;}


    /*setters*/
    public void setSerialNum(String serialNum){
        if (serialNum.length() > 0)
            this.serialNum = serialNum;
    }
    public void setCapacity(int capacity){
        if (capacity > 0)
            this.capacity = capacity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutomovelLigeiro that = (AutomovelLigeiro) o;
        return power == that.power && capacity == that.capacity && distance == that.distance && total == that.total && Objects.equals(registration, that.registration) && Objects.equals(brand, that.brand) && Objects.equals(model, that.model) && Objects.equals(serialNum, that.serialNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration, brand, model, power, serialNum, capacity, distance, total);
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de série: " + serialNum +
                "\nCapacidade: " + capacity + " kg";
    }
}
