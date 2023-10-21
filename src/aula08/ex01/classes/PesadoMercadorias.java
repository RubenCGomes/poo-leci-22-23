package aula08.ex01.classes;

import java.util.Objects;

public class PesadoMercadorias extends Pesado{
    private int carga;

    public PesadoMercadorias(String registration, String brand, String model, int power, String quadro, int peso, int carga) {
        super(registration, brand, model, power, quadro, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PesadoMercadorias that = (PesadoMercadorias) o;
        return carga == that.carga;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carga);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarga: " + carga;
    }
}
