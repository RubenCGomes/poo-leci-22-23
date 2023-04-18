package aula08.ex03.classes;

import aula08.ex03.interfaces.*;
import java.util.HashMap;
import java.util.Set;

public class CarrinhoDeCompras implements Compra {
    HashMap<Produto, Integer> compras = new HashMap<>();

    public CarrinhoDeCompras(){}

    @Override
    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.getQuantidade() < quantidade) {
            quantidade = produto.getQuantidade();
        }
        produto.removerQuantidade(quantidade);

        compras.put(produto, quantidade);
    }

    @Override
    public void listarProdutos() {
        String s = "Lista compras:\n";

        for (Produto produto : compras.keySet()) {
            s += "Produto: " + produto.getNome() +
                    "\n\tQuantidade:" + compras.get(produto) +
                    "\n\tPreço: " + produto.getPreco() + "\n";
        }
        System.out.println(s);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        Set<Produto> keys = compras.keySet();

        for (Produto produto : keys) {
                total += produto.getPreco() * compras.get(produto);
        }
        return total;
    }
}
