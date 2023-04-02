package aula07.ex01;

import utils.UserInput;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int option1;
        // Círculos
        double radius1 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza o raio do círculo c1: ");
        Circulo c1 = new Circulo(radius1);

        double radius2 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza o raio do círculo c2: ");
        Circulo c2 = new Circulo(radius2);

        //Retângulos
        double rect1width = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza o comprimento do retângulo r1: ");
        double rect1height = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza a largura do retângulo r1: ");
        Retangulo r1 = new Retangulo(rect1width, rect1height);

        double rect2width = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza o comprimento do retângulo r2: ");
        double rect2height = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza a largura do retângulo r2: ");
        Retangulo r2 = new Retangulo(rect2width, rect2height);

        //Triângulos
        double tri1side1 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza um lado do triângulo t1: ");
        double tri1side2 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza um lado do triângulo t1: ");
        double tri1side3 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza um lado do triângulo t1: ");
        Triangulo t1 = new Triangulo(tri1side1, tri1side2, tri1side3);

        double tri2side1 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza um lado do triângulo t2: ");
        double tri2side2 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza um lado do triângulo t2: ");
        double tri2side3 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Introduza um lado do triângulo t2: ");
        Triangulo t2 = new Triangulo(tri2side1, tri2side2, tri2side3);


        while (true) {
            System.out.println("Funções disponíveis: \n1 - setSides() \n2 - equals() \n3 - getSides() \n4 - perimeter() \n5 - area() \n6 - toString() \n7 - Sair");
            option1 = UserInput.readIntClosed(1, 7, "Introduza a função que pretende executar: ");
            if (option1 == 2) {
                System.out.println("Figuras a comparar:\n1 - Círculos\n2 - Retângulos\n3 - Triângulos");
                int option2 = UserInput.readIntClosed(1, 3, "Introduza a figura que pretende comparar: ");
                if (option2 == 1) {
                    if (c1.equals(c2)) {
                        System.out.println("São iguais");
                    } else System.out.println("São diferentes");
                } else if (option2 == 2) {
                    if (r1.equals(r2)) {
                        System.out.println("São iguais");
                    } else System.out.println("São diferentes");
                } else if (option2 == 3) {
                    if (t1.equals(t2)) {
                        System.out.println("São iguais");
                    } else System.out.println("São diferentes");
                }
            } else if (option1 == 1) {
                System.out.println("Introduza a figura a mudar os valores (c1, c2, r1, r2, t1, t2): ");
                String option2 = inp.next();
                switch (option2) {
                    case "c1" ->
                            c1.setRadius(UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para o raio: "));
                    case "c2" ->
                            c2.setRadius(UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para o raio: "));
                    case "r1" -> {
                        double width = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para o comprimento: ");
                        double height = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para a largura: ");
                        r1.setSides(width, height);
                    }
                    case "r2" -> {
                        double width2 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para o comprimento: ");
                        double height2 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para a largura: ");
                        r2.setSides(width2, height2);
                    }
                    case "t1" -> {
                        double side1 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para o lado 1: ");
                        double side2 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para o lado 2: ");
                        double side3 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para o lado 3: ");
                        t1.setSides(side1, side2, side3);
                    }
                    case "t2" -> {
                        double side4 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para o lado 1: ");
                        double side5 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para o lado 2: ");
                        double side6 = UserInput.readDoubleOpen(0, Double.POSITIVE_INFINITY, "Valor desejado para o lado 3: ");
                        t2.setSides(side4, side5, side6);
                    }
                }
            } else if (option1 == 3) {
                System.out.println("Introduza a figura a mostrar os valores (c1, c2, r1, r2, t1, t2): ");
                String option2 = inp.next();
                switch (option2) {
                    case "c1" -> System.out.println("Raio: " + c1.getRadius());
                    case "c2" -> System.out.println("Raio: " + c2.getRadius());
                    case "r1" ->
                            System.out.println("Comprimento: " + r1.getSides()[0] + "\nLargura: " + r1.getSides()[1]);
                    case "r2" ->
                            System.out.println("Comprimento: " + r2.getSides()[0] + "\nLargura: " + r2.getSides()[1]);
                    case "t1" ->
                            System.out.println("Lado 1: " + t1.getSides()[0] + "\nLado 2: " + t1.getSides()[1] + "\nLado 3: " + t1.getSides()[2]);
                    case "t2" ->
                            System.out.println("Lado 1: " + t2.getSides()[0] + "\nLado 2: " + t2.getSides()[1] + "\nLado 3: " + t2.getSides()[2]);
                }
            } else if (option1 == 4) {
                System.out.println("Introduza a figura a mostrar o perímetro (c1, c2, r1, r2, t1, t2): ");
                String option2 = inp.next();
                switch (option2) {
                    case "c1" -> System.out.println("Perímetro: " + c1.perimeter());
                    case "c2" -> System.out.println("Perímetro: " + c2.perimeter());
                    case "r1" -> System.out.println("Perímetro: " + r1.perimeter());
                    case "r2" -> System.out.println("Perímetro: " + r2.perimeter());
                    case "t1" -> System.out.println("Perímetro: " + t1.perimeter());
                    case "t2" -> System.out.println("Perímetro: " + t2.perimeter());
                }
            } else if (option1 == 5) {
                System.out.println("Introduza a figura a mostrar a área (c1, c2, r1, r2, t1, t2): ");
                String option2 = inp.next();
                switch (option2) {
                    case "c1" -> System.out.println("Área: " + c1.area());
                    case "c2" -> System.out.println("Área: " + c2.area());
                    case "r1" -> System.out.println("Área: " + r1.area());
                    case "r2" -> System.out.println("Área: " + r2.area());
                    case "t1" -> System.out.println("Área: " + t1.area());
                    case "t2" -> System.out.println("Área: " + t2.area());
                }
            } else if (option1 == 6) {
                System.out.println("Introduza a figura a mostrar a informação da figura (c1, c2, r1, r2, t1, t2): ");
                String option2 = inp.next();
                switch (option2) {
                    case "c1" -> System.out.println(c1);
                    case "c2" -> System.out.println(c2);
                    case "r1" -> System.out.println(r1);
                    case "r2" -> System.out.println(r2);
                    case "t1" -> System.out.println(t1);
                    case "t2" -> System.out.println(t2);
                }
            } else if (option1 == 7) {
                System.out.println("A sair...");
                break;
            }
        }
    }
}
