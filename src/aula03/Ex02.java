package aula03;

import utils.classes.UserInput;

public class Ex02 {
    public static void main(String[] args){
        double total;
        int mont = UserInput.readIntClosed(1000, Double.POSITIVE_INFINITY, "Introduza o montante: ");
        while (true){
            if (mont % 1000 != 0)
                mont = UserInput.readIntClosed(1000, Double.POSITIVE_INFINITY, "Introduza o montante: ");
            else break;
        }
        double taxa = UserInput.readIntClosed(0, 5, "Introduza a taxa mensal: ");
        total = mont;
        for (int i = 1; i < 13; i++) {
            total += total * (taxa / 100);
            System.out.printf("Mês %-2d: %.2f€\n", i, total);
        }
    }
}
