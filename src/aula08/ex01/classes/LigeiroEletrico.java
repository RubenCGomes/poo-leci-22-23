package aula08.ex01.classes;

import aula08.ex01.interfaces.*;

import java.util.Objects;

public class LigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico {
    private int percentagem;

    public LigeiroEletrico(String registration, String brand, String model, int power, String serialNum, int capacity, int percentagem) {
        super(registration, brand, model, power, serialNum, capacity);
        this.percentagem = percentagem;
    }

    public void descarregar(int percentagem){
        assert this.percentagem > percentagem;
        if (percentagem > 0){
            this.percentagem -= percentagem;
        }
    }

    public void carregar(int percentagem){
        if (this.percentagem + percentagem >= 100)
            this.percentagem = 100;
        else
            this.percentagem += percentagem;
    }

    public int autonomia(){return percentagem;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LigeiroEletrico that = (LigeiroEletrico) o;
        return percentagem == that.percentagem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), percentagem);
    }

    public String toString(){
        return super.toString() + "\nPercentagem: " + autonomia() + "%";
    }
}
