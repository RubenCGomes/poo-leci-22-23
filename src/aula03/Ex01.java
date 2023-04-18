package aula03;

import utils.classes.UserInput;
import utils.classes.MathUtils;

public class Ex01 {
    public static void main(String[] args){
        int sum = 0;
        int number = UserInput.readIntClosed(1, Double.POSITIVE_INFINITY, "Introduza o número N natural");
        for (int i = 2; i < number + 1; i++) {
            if (MathUtils.isPrime(i))
                sum += i;
        }
        System.out.println("Soma = " + sum);
    }
}
