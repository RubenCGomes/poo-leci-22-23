package aula02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        double c1, c2, h, ang;
        Scanner inp = new Scanner(System.in);
        System.out.println("Indique o valor do primeiro cateto(A): ");
        c1 = inp.nextDouble();
        System.out.println("Indique o valor do segundo cateto(B): ");
        c2 = inp.nextDouble();
        h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        System.out.println("O valor da hipotenusa(C) é " + h);
        ang = Math.asin(c2 / h);
        System.out.println("O ângulo entre A e C é " + Math.toDegrees(ang) + "º");
    }
}
