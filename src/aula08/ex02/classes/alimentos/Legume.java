package aula08.ex02.classes.alimentos;

import java.util.Objects;

public class Legume extends Alimento{
    private String nome;

    public Legume(String nome, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.nome = nome; isVegan = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Legume legume = (Legume) o;
        return Objects.equals(nome, legume.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Legume " + nome + ", " + super.toString();
    }
}
