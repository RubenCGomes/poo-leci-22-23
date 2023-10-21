package aula02;

import utils.classes.UserInput;

public class Ex09 {
    public static void main(String[] args){
        int number, i;
        number = UserInput.readIntClosed(1, Double.POSITIVE_INFINITY, "Introduza um valor N natural: ");
        for (i = number; i > 0; i--){
            System.out.println(i);
            if (i % 10 == 0) System.out.println();
        }
    }
}
