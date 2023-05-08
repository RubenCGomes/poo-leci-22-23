package aula09.ex03.classes;

import aula09.ex03.enums.PlaneType;

public class CommercialPlane extends Plane{
    private int numTrip;

    public CommercialPlane(String id, String maker, String model, int production, int passengers, int speed, int numTrip) {
        super(id, maker, model, production, passengers, speed, PlaneType.Commercial);
        this.numTrip = numTrip;
    }

    public int getNumTrip() {
        return numTrip;
    }

    public void setNumTrip(int numTrip) {
        this.numTrip = numTrip;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + getPlaneType() + ", has " + numTrip + " crew members";
    }
}
