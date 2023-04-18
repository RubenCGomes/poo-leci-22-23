package aula08.ex02.classes.alimentos;

import java.util.Objects;

public abstract class Alimento {
    double proteinas; double calorias; double peso; boolean isVegan;

    public Alimento(double proteinas, double calorias, double peso) {
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString(){
        return "Proteinas " + proteinas + ", calorias " + calorias + ", Peso " + peso;
    }
}
