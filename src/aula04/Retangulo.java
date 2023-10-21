package aula04;

public class Retangulo {
    private double width, height;
    public Retangulo(double width, double height){
        if (width < 0 || height < 0) { System.out.println("Introduziu um valor inválido"); }
        else { this.height = height; this.width = width; }
    }

    public void setSides(double width, double height){
        if (width < 0 || height < 0) { System.out.println("Introduziu um valor inválido"); }
        else { this.height = height; this.width = width; }
    }

    public boolean equals(Retangulo rectangle){
        return (this.width == rectangle.width && this.height == rectangle.height);
    }

    public double[] getSides(){ return new double[]{width, height}; }

    public double perimeter(){ return ((width * 2) + (height * 2)); }
    public double area (){ return (width * height); }

    public String toString(){ return "Base do retângulo: " + width + "\n" + "Altura do retângulo: " + height; }
}
