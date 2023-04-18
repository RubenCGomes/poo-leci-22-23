package aula08.ex02.classes.pratos;

import aula08.ex02.classes.alimentos.Alimento;

public class PratoDieta extends Prato{
    double max;
    public PratoDieta(String nome, double max) {
        super(nome); this.max = max;
    }

    @Override
    public boolean addIngrediente(Alimento ingr) {
        double total = 0;
        for (Alimento alimento : composicao) {
            total += alimento.getCalorias();
            if (total + ingr.getCalorias() > this.max) return false;
        }
        super.addIngrediente(ingr);
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - Prato Dieta(%.2f Calorias)", max);
    }
}
