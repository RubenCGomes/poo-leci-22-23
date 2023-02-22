package aula02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        double valorMax, valorMin, media, number, initNumber, somaNumeros;
        int totalNumeros;
        Scanner inp = new Scanner(System.in);
        System.out.println("Indique um número real (Introduza o valor inicial para terminar): ");
        initNumber = inp.nextDouble();
        valorMax = initNumber; valorMin = initNumber; totalNumeros = 1; somaNumeros = initNumber;
        while (true){
            System.out.println("Indique um número real (Introduza o valor inicial para terminar): ");
            number = inp.nextDouble();
            if (number == initNumber) break;

            if (valorMax < number) valorMax = number;
            if (valorMin > number) valorMin = number;
            ++totalNumeros;
            somaNumeros += number;
        }
        media = somaNumeros / totalNumeros;
        System.out.printf("Valor máximo: %.2f \nValor mínimo: %.2f \nMédia: %.2f \nTotal de números: %d",
                valorMax, valorMin, media, totalNumeros);
    }
}
