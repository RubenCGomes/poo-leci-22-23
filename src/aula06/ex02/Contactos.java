package aula06.ex02;

import aula05.DateYMD;
import aula06.ex01.Pessoa;
import utils.classes.UserInput;

public class Contactos extends Pessoa {
    int number; String email;
    public static int id = 0;
    public Contactos(String nome, int cc, DateYMD dataNasc){
        super(nome, cc, dataNasc);
        id++;

        this.email = UserInput.readEmail("Introduza um email: ");
        this.number = UserInput.readNumber("Introduza um número que começe por 9: ");
    }
    public String getEmail(){return email;}

    public int getNumber(){return number;}

    public int getID(){return id;}

    public void setEmail(){
        this.email = UserInput.readEmail("Introduza um email: ");
    }

    public void setNumber(){
        this.number = UserInput.readNumber("Introduza um número que começe por 9: ");
    }

    public String toString(){
        return super.toString() + "; Email: " + email + "; Número: " + number + "; ID: " + id;
    }
}
