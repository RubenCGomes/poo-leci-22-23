package aula02;

import utils.UserInput;

public class Ex04 {
    public static void main(String[] args){
        double mont, taxa, total;
        mont = UserInput.readIntClosed(0, Double.POSITIVE_INFINITY, "Introduza o montante: ");
        taxa = UserInput.readIntClosed(0, Double.POSITIVE_INFINITY, "Introduza a taxa mensal: ");
        total = mont;
        for (int i = 1; i < 4; i++)
            total += total * (taxa / 100);
        System.out.println("O montante ao fim de 3 meses é de " + total + " euros");
    }
}
