package aula08.ex01.classes;

import aula08.ex01.interfaces.KmPercorridosInterface;
import utils.classes.UserInput;

public abstract class Veiculo implements KmPercorridosInterface {
    String registration; String brand; String model; int power;
    int distance; int total;

    public Veiculo(String registration, String brand, String model, int power){
        if ((UserInput.validRegistration(registration)) && (power > 0)){
            this.registration = registration; this.brand = brand; this.model = model; this.power = power;
        }
    }

    /* getters */
    public String getRegistration(){return registration;}

    public String getBrand(){return brand;}

    public String getModel(){return model;}

    public int getPower(){return power;}


    /* setters */
    public void setRegistration(String registration){
        if (UserInput.validRegistration(registration))
            this.registration = registration;
    }

    public void setBrand(String brand){this.brand = brand;}

    public void setModel(String model){this.model = model;}

    public void setPower(int power){
        if (power > 0)
            this.power = power;
    }


    /* implements */
    @Override
    public void trajeto(int quilometros) {
        if (quilometros < 0) return;
        this.distance = quilometros; this.total += distance;
    }

    @Override
    public int ultimoTrajeto() {
        return this.distance;
    }

    @Override
    public int distanciaTotal() {
        return this.total;
    }


    /*toString*/
    @Override
    public String toString() {
        return "Veículo: " + brand + " " + model + ", " + power + " cv\n" +
               "Matrícula: " + registration + "\n"+
               "Distância total: " + total + " km";
    }
}
