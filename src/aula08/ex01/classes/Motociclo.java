package aula08.ex01.classes;

import java.util.Objects;

public class Motociclo extends Veiculo{
    MotorcycleType type;

    public Motociclo(String registration, String brand, String model, int power, MotorcycleType type){
        super(registration, brand, model, power);
        this.type = type;
    }


    /* getters */
    public MotorcycleType getType(){return type;}


    /*setters*/
    public void setType(MotorcycleType type){
        this.type = type;
    }


    /*equals and toString*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motociclo motociclo = (Motociclo) o;
        return power == motociclo.power && distance == motociclo.distance && total == motociclo.total && Objects.equals(registration, motociclo.registration) && Objects.equals(brand, motociclo.brand) && Objects.equals(model, motociclo.model) && Objects.equals(type, motociclo.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration, brand, model, power, type, distance, total);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Tipo: " + type;
    }
    public enum MotorcycleType{
        Desportivo, Estrada
    }
}
