package aula08.ex03.classes;

import java.util.Objects;

public class ProdutoComDesconto extends ProdutoGenerico {
    int desconto;

    public ProdutoComDesconto(String nome, double preco, int quantidade, int desconto) {
        super(nome, preco, quantidade);
        this.desconto = desconto;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    @Override
    public double getPreco() {
        return super.getPreco() * (1 - (double) desconto / 100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoComDesconto that = (ProdutoComDesconto) o;
        return desconto == that.desconto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(desconto);
    }
}
