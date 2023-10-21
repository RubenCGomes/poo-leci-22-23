package aula02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){
        double p1x, p1y, p2x, p2y, dist;
        Scanner inp = new Scanner(System.in);
        System.out.println("Introduza a coordenada x do ponto p1");
        p1x = inp.nextDouble();
        System.out.println("Introduza a coordenada y do ponto p1");
        p1y = inp.nextDouble();
        System.out.println("Introduza a coordenada x do ponto p2");
        p2x = inp.nextDouble();
        System.out.println("Introduza a coordenada y do ponto p2");
        p2y = inp.nextDouble();
        dist = Math.sqrt(Math.pow(p1x - p2x, 2) + Math.pow(p1y - p2y, 2));
        System.out.println("A distância entre p1 e p2 é de " + dist);
        
    }
}
