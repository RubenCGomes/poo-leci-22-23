package aula09.ex03.classes;

import aula09.ex03.enums.PlaneType;

public class MilitaryPlane extends Plane{
    private int numMissiles;

    public MilitaryPlane(String id, String maker, String model, int production, int passengers, int speed, int numMissiles) {
        super(id, maker, model, production, passengers, speed, PlaneType.MilitaryPlane);
        this.numMissiles = numMissiles;
    }

    public int getNumMissiles() {
        return numMissiles;
    }

    public void setNumMissiles(int numMissiles) {
        this.numMissiles = numMissiles;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + getPlaneType() + ", has " + numMissiles + " missiles";
    }
}
