package aula08.ex02.classes.alimentos;

import aula08.ex02.enums.VariedadeCarne;

import java.util.Objects;

public class Carne extends Alimento {
    private VariedadeCarne tipo;

    public Carne(VariedadeCarne tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo; isVegan = false;
    }

    public VariedadeCarne getTipo() {
        return tipo;
    }

    public void setTipo(VariedadeCarne tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carne carne = (Carne) o;
        return tipo == carne.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }

    @Override
    public String toString() {
        return "Carne "+ getTipo() + " " + super.toString();
    }
}
