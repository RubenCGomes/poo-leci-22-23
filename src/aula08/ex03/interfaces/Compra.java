package aula08.ex03.interfaces;

public interface Compra {
    void adicionarProduto (Produto produto, int quantidade);
    void listarProdutos();
    double calcularTotal();
}
