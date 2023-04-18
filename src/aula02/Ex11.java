package aula02;

import java.util.Scanner;

import utils.classes.UserInput;

public class Ex11 {
    public static void main(String[] args) {
        int min, max;
        Scanner inp = new Scanner(System.in);
        System.out.println("Introduza o valor mínimo: ");
        min = inp.nextInt();
        System.out.println("Introduza o valor máximo: ");
        max = inp.nextInt();
        int number = UserInput.readIntClosed(min, max,"Introduza o valor máximo: ");
        System.out.println(number);
    }
}
