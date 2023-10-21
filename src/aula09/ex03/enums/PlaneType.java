package aula09.ex03.enums;

public enum PlaneType {
    Commercial, MilitaryPlane;

    @Override
    public String toString(){
        return switch (this){
            case Commercial -> "Commercial";
            case MilitaryPlane -> "Military";
        };
    }
}
