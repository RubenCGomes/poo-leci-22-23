package aula06.ex01;

import aula05.*;
import utils.*;

public class Pessoa {
    String nome;
    int cc;
    DateYMD dataNasc;

    public Pessoa(String nome, int cc, DateYMD dataNasc){
        if (nome.matches("[ A-Za-z]+") && String.valueOf(cc).length() == 8){
            this.dataNasc = dataNasc; this.cc = cc; this.nome = nome;
        }
        else System.out.println("Dados inválidos");
    }

    public String getName(){return nome;}

    public void setName(){this.nome = UserInput.readName("Nome: ");}

    public int getCc(){return cc;}

    public void setCc(){this.cc = UserInput.readCc("CC: ");}

    public DateYMD getDataNasc(){return dataNasc;}

    public void setDataNasc(){
        int[] date = DateFuncts.readDDMMYY("Data de Nascimento: ");
        this.dataNasc = new DateYMD(date[0], date[1], date[2]);
    }

    public String toString(){
        return "Nome: " + nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc;
    }
}

