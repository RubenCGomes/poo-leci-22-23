package aula09.ex03.classes;

import aula09.ex03.enums.PlaneType;

public abstract class Plane {
    private String id; private String maker; private String model;
    private int production; private int passengers; private int speed;
    private PlaneType type;


    public Plane(String id, String maker, String model, int production, int passengers, int speed, PlaneType type) {
        this.id = id;
        this.maker = maker;
        this.model = model;
        this.production = production;
        this.passengers = passengers;
        this.speed = speed;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public PlaneType getPlaneType() {
        return type;
    }

    public void setPlaneType(PlaneType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plane " + maker + " " + model + ", " + production + ", " + passengers +" passengers, max speed: " +  speed;
    }
}
