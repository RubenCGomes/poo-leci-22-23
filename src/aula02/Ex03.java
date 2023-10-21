package aula02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        double iniT, finT, M, Q;
        Scanner inp = new Scanner(System.in);
        System.out.println("Temperatura inicial(ºC)? ");
        iniT = inp.nextDouble();
        System.out.println("Temperatura final(ºC)? ");
        finT = inp.nextDouble();
        System.out.println("Quantidade de água(kg)? ");
        M = inp.nextDouble();
        Q = M * (finT - iniT) * 4184;
        System.out.println("A energia necessária para aquecer a água é " + Q + " J");
    }
}
