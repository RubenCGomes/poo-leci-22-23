package aula08.ex02.classes.alimentos;

import aula08.ex02.enums.TipoPeixe;

import java.util.Objects;

public class Peixe extends Alimento{
    private TipoPeixe tipo;

    public Peixe(TipoPeixe tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo; isVegan = false;
    }

    public TipoPeixe getTipo() {
        return tipo;
    }

    public void setTipo(TipoPeixe tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peixe peixe = (Peixe) o;
        return tipo == peixe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }

    @Override
    public String toString() {
        return "Peixe " + getTipo() + " " + super.toString();
    }
}
