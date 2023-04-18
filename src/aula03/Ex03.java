package aula03;

import utils.classes.UserInput;
import utils.classes.RandNumber;

import java.util.Objects;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int guess = 0, tries, rand;
        String resposta = "S";

        while (Objects.equals(resposta, "S") || Objects.equals(resposta, "Sim")){
            tries = 0;
            rand = RandNumber.RandIntOne(101);
            while (true){
                guess = UserInput.readIntClosed(1, 100, "Introduza um número N natural: ");
                ++tries;
                if (guess == rand) {
                    System.out.println("Acertou");
                    break;
                }
                else if (guess > rand)
                    System.out.println("Alto");
                else
                    System.out.println("Baixo");
            }
            System.out.println("Total de tentativas: " + tries);
            System.out.println("Pretende continuar? Prima (S)im ");
            resposta = sc.next();
        }
    }
}
