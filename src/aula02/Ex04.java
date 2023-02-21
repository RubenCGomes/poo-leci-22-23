package aula02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        double mont, taxa, total;
        Scanner inp = new Scanner(System.in);
        System.out.println("Introduza o montante: ");
        mont = inp.nextDouble();
        System.out.println("Introduza a taxa mensal: ");
        taxa = inp.nextDouble();
        total = mont;
        for (int i = 1; i < 4; i++)
            total += total * (taxa / 100);
        System.out.println("O montante ao fim de 3 meses é de " + total + " euros");
    }
}
