package aula08.ex02.classes.pratos;

import aula08.ex02.classes.alimentos.Alimento;

import java.util.LinkedList;
import java.util.Objects;

public class Prato{
    String nome; LinkedList<Alimento> composicao = new LinkedList<>();

    public Prato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean addIngrediente(Alimento ingr){
        composicao.add(ingr);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prato prato = (Prato) o;
        return Objects.equals(nome, prato.nome) && Objects.equals(composicao, prato.composicao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, composicao);
    }

    @Override
    public String toString() {
        return String.format("Prato '%1s', composto por %2s Ingredientes", nome, composicao.size());
    }
}
