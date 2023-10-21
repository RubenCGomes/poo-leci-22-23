package aula02;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        double celc, far;
        Scanner inp = new Scanner(System.in);
        System.out.println("Temperatura em Celsius? ");
        celc = inp.nextDouble();
        far = 1.8 * celc + 32;
        System.out.println("A temperatura em Fahrenheit é " + far);
    }
}
