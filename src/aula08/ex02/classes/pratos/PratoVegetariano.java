package aula08.ex02.classes.pratos;

import aula08.ex02.classes.alimentos.Alimento;


public class PratoVegetariano extends Prato{
    public PratoVegetariano(String nome) {
        super(nome);
    }

    @Override
    public boolean addIngrediente(Alimento ingr) {
        if (ingr.isVegan()){
            super.addIngrediente(ingr);
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return super.toString() + " - Prato Vegetariano";
    }
}
