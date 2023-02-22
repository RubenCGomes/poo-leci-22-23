package aula02;

import utils.UserInput;

public class Ex01 {
    public static void main(String[] args){
        double kmh, mph;
        kmh = UserInput.readIntClosed(0, Double.POSITIVE_INFINITY, "Distância em km/h? ");
        mph = kmh / 1.609;
        System.out.println("A distância em milhas por hora é " + mph + "mph");
    }
}
