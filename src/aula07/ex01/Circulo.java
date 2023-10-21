package aula07.ex01;

public class Circulo extends Forma{
    private double radius;
    private String color;

    public Circulo(double radius) {
        if (radius < 0){ System.out.println("Introduziu um valor inválido"); }
        else { this.radius = radius; }
    }

    public void setRadius(double radius){
        if (radius < 0){ System.out.println("Introduziu um valor inválido"); }
        else { this.radius = radius; }
    }

    public void setColor(String color){ this.color = color; }

    public boolean equals(Circulo circle){ return circle.radius == this.radius; }

    public double getRadius(){ return this.radius; }

    public double area(){ return Math.PI * Math.pow(radius, 2); }

    public double perimeter(){ return 2 * Math.PI * this.radius; }

    public String toString(){ return "Raio do círculo: " + radius +"; Cor: " + color; }

    public String color(String color){return this.color;}
}
