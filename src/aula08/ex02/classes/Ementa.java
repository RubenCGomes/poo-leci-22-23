package aula08.ex02.classes;

import aula08.ex02.classes.pratos.Prato;
import utils.enums.DiaSemana;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;

public class Ementa {
    String nome; String local; LinkedHashMap<DiaSemana, Prato> pratos = new LinkedHashMap<>();

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public void addPrato(Prato prato, DiaSemana dia){
        pratos.put(dia, prato);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LinkedHashMap<DiaSemana, Prato> getPratos() {
        return pratos;
    }

    public void setPratos(LinkedHashMap<DiaSemana, Prato> pratos) {
        this.pratos = pratos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ementa ementa = (Ementa) o;
        return Objects.equals(nome, ementa.nome) && Objects.equals(local, ementa.local) && Objects.equals(pratos, ementa.pratos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, local, pratos);
    }

    @Override
    public String toString() {
        String str = "";
        Set<DiaSemana> keys = pratos.keySet();

        for (DiaSemana dia: keys){
            str += pratos.get(dia) + String.format(", dia %s\n", dia);
        }
        return str;
    }
}
