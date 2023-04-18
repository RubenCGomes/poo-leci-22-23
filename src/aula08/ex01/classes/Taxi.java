package aula08.ex01.classes;

import java.util.Objects;

public class Taxi extends AutomovelLigeiro {
    private int license;
    public Taxi (String registration, String brand, String model, int power, String serialNum, int capacity, int license){
        super(registration, brand, model, power, serialNum, capacity);
        if (String.valueOf(license).length() > 0)
            this.license = license;
    }
    /*getters and setters*/
    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Taxi taxi = (Taxi) o;
        return license == taxi.license;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), license);
    }

    public String toString(){
        return super.toString() + "\nLicença: " + license;
    }
}
