package aula02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        double v1, d1, v2, d2, vm;
        Scanner inp = new Scanner(System.in);
        System.out.println("Velocidade do primeiro trajeto? ");
        v1 = inp.nextDouble();
        System.out.println("Distância do primeiro trajeto? ");
        d1 = inp.nextDouble();
        System.out.println("Velocidade do segundo trajeto? ");
        v2 = inp.nextDouble();
        System.out.println("Distância do segundo trajeto? ");
        d2 = inp.nextDouble();
        vm = (d1 + d2) / ((d1 / v1) + (d2 / v2));
        System.out.println("A velocidade média é de " + vm + " km/h");
    }
}
