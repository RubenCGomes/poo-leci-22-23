package aula02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        double kmh, mph;
        Scanner inp = new Scanner(System.in);
        System.out.println("Distância em km/h? ");
        kmh = inp.nextDouble();
        mph = kmh / 1.609;
        System.out.println("A distância em minha é " + mph);
    }
}
