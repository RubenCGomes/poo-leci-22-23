package aula07.ex01;

public class Triangulo extends Forma {
    private double side1, side2, side3;
    private String color;

    public Triangulo(double side1, double side2, double side3){
        if (!(side1 > 0 && side2 > 0 && side3 > 0)) {
            System.out.println("Os lados do triângulo não podem ser negativos"); return;
        }
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            System.out.println("Os lados do triângulo não formam um triângulo"); return;
        }
        this.side1 = side1; this.side2 = side2; this.side3 = side3;
    }

    public void setSides(double side1, double side2, double side3){
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Os lados do triângulo têm de ser positivos"); return;
        }
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            System.out.println("Os lados do triângulo não formam um triângulo"); return;
        }
        this.side1 = side1; this.side2 = side2; this.side3 = side3;
    }

    public boolean equals(Triangulo triangle){
        return (triangle.side1 == this.side1 && triangle.side2 == this.side2 && triangle.side3 == this.side3);
    }

    public double[] getSides(){ return new double[] {this.side1, this.side2, this.side3}; }

    public void setColor(String color){ this.color = color; }

    public double perimeter(){ return this.side1 + this.side2 + this.side3; }

    public double area(){
        double p = this.perimeter() / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public String color(String color){ return this.color; }

    public String toString(){ return "Lados do triângulo: " + this.side1 + ", " + this.side2 + ", " + this.side3 +"; Cor: " + color ; }
}
