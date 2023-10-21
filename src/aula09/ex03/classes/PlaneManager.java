package aula09.ex03.classes;

import aula09.ex03.enums.PlaneType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PlaneManager {
    HashMap<String, Plane> planes = new HashMap<>();

    public void addPlane(Plane plane){
        planes.put(plane.getId(), plane);
    }

    public void removePlane(String id){
        planes.remove(id);
    }

    public Plane searchPlane(String id){
        return planes.get(id);
    }

    public ArrayList getCommercialPlanes(){
        ArrayList<Plane> list = new ArrayList<>();
        Set<String> keys = planes.keySet();

        for (String key : keys) {
            if (planes.get(key).getPlaneType().equals(PlaneType.Commercial))
                list.add(planes.get(key));
        }
        return list;
    }

    public ArrayList getMilitaryPlanes(){
        ArrayList<Plane> list = new ArrayList<>();
        Set<String> keys = planes.keySet();

        for (String key : keys) {
            if (planes.get(key).getPlaneType().equals(PlaneType.MilitaryPlane))
                list.add(planes.get(key));
        }
        return list;
    }

    public void printAllPlanes(){
        Set<String> keys = planes.keySet();

        for (String key : keys){
            System.out.println("ID: " + planes.get(key) + ", " + planes.get(key).toString());
        }
    }

    public Plane getFastestPlane(){
        Set<String> keys = planes.keySet();
        Plane plane = null;
        int max = 0;

        for (String key : keys) {
            if (planes.get(key).getSpeed() > max) {
                max = planes.get(key).getSpeed();
                plane = planes.get(key);
            }
        }
        return plane;
    }
}
