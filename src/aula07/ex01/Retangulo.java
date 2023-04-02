package aula07.ex01;

public class Retangulo extends Forma {
    private double width, height;
    private String color;

    public Retangulo(double width, double height, String color){
        if (width < 0 || height < 0) { System.out.println("Introduziu um valor inválido"); }
        else { this.height = height; this.width = width; this.color = color;}
    }

    public Retangulo(double width, double height){
        if (width < 0 || height < 0) { System.out.println("Introduziu um valor inválido"); }
        else { this.height = height; this.width = width; }
    }

    public void setSides(double width, double height){
        if (width < 0 || height < 0) { System.out.println("Introduziu um valor inválido"); }
        else { this.height = height; this.width = width; }
    }

    public void setColor(String color){ this.color = color; }

    public boolean equals(Retangulo rectangle){
        return (this.width == rectangle.width && this.height == rectangle.height);
    }

    public double[] getSides(){ return new double[]{width, height}; }

    public double perimeter(){ return ((width * 2) + (height * 2)); }
    public double area (){ return (width * height); }

    public String toString(){ return "Base do retângulo: " + width + "\n" + "Altura do retângulo: " + height + "\nCor: " + color; }

    public String color(String color){return this.color;}
}
