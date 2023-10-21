package aula08.ex03.classes;

import aula08.ex03.interfaces.Produto;

import java.util.Objects;

public class ProdutoGenerico implements Produto {
    String nome; double preco; int quantidade;

    public ProdutoGenerico(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public void removerQuantidade(int quantidade) {
        if (this.quantidade - quantidade < 0)
            this.quantidade = 0;
        else{
            this.quantidade -= quantidade;
        }
    }
}
