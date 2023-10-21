package aula08.ex01.classes;

import java.util.Objects;

public class PesadoPassageiros extends Pesado{
    private int passageiros;

    public PesadoPassageiros(String registration, String brand, String model, int power, String quadro, int peso, int passageiros) {
        super(registration, brand, model, power, quadro, peso);
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PesadoPassageiros that = (PesadoPassageiros) o;
        return passageiros == that.passageiros;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passageiros);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMáximo passageiros: " + passageiros;
    }
}
