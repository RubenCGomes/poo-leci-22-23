package aula08.ex01.interfaces;

public interface VeiculoEletrico {
    void descarregar(int percentagem);
    int autonomia();
    void carregar(int percentagem);
}
