package aula02;

import utils.UserInput;

public class Ex08 {
    public static void main(String[] args){
        double c1, c2, h, ang;
        c1 = UserInput.readIntOpen(0, Double.POSITIVE_INFINITY, "Indique o valor do primeiro cateto(A): ");
        c2 = UserInput.readIntOpen(0, Double.POSITIVE_INFINITY, "Indique o valor do segundo cateto(B): ");
        h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        System.out.println("O valor da hipotenusa(C) é " + h);
        ang = Math.asin(c2 / h);
        System.out.println("O ângulo entre A e C é " + Math.toDegrees(ang) + "º");
    }
}
