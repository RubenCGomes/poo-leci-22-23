package aula08.ex01.classes;

import java.util.Objects;

public class Pesado extends Veiculo{
    private String quadro; private int peso;

    public Pesado(String registration, String brand, String model, int power, String quadro, int peso) {
        super(registration, brand, model, power);
        this.quadro = quadro;
        this.peso = peso;
    }

    public String getQuadro() {
        return quadro;
    }

    public void setQuadro(String quadro) {
        this.quadro = quadro;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pesado pesado = (Pesado) o;
        return peso == pesado.peso && Objects.equals(quadro, pesado.quadro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quadro, peso);
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuadro: " + quadro + "\nPeso: " + peso;
    }
}
