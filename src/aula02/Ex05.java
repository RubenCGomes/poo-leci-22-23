package aula02;

import utils.classes.UserInput;

public class Ex05 {
    public static void main(String[] args){
        double v1, d1, v2, d2, vm;
        v1 = UserInput.readIntOpen(0, Double.POSITIVE_INFINITY, "Velocidade do primeiro trajeto? ");
        d1 = UserInput.readIntOpen(0, Double.POSITIVE_INFINITY, "Distância do primeiro trajeto? ");
        v2 = UserInput.readIntOpen(0, Double.POSITIVE_INFINITY, "Velocidade do segundo trajeto? ");
        d2 = UserInput.readIntOpen(0, Double.POSITIVE_INFINITY, "Distância do segundo trajeto? ");
        vm = (d1 + d2) / ((d1 / v1) + (d2 / v2));
        System.out.println("A velocidade média é de " + vm + " km/h");
    }
}
