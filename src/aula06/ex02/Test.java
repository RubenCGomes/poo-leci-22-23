package aula06.ex02;

import aula05.DateYMD;
import utils.classes.DateFuncts;
import utils.classes.UserInput;

public class Test {
    public static void main(String[] args){
        // limite 10 contactos!
        Contactos[] contacts = new Contactos[10];
        int count = 0; int option1;

        while (true){
            int option2;
            option1 = UserInput.readIntClosed(0, 5, "1 - Inserir contacto\n2 - Alterar contacto\n3 - Apagar contacto\n4 - Procurar contacto\n5 - Listar contactos\n0 - Sair");
            switch (option1) {
                case 0 -> {
                    System.out.println("A sair...");
                    System.exit(0);
                }
                case 1 -> {
                    String nome = UserInput.readName("Introduza um nome: ");
                    for (int i = 0; i < contacts.length; i++) {
                        if (contacts[i] == null) continue;
                        if (contacts[i].getName().equals(nome)) {
                            option2 = UserInput.readIntClosed(0, 1, " Nome já existente. Deseja sobrepor? 1 - Sim, 0 - Não");
                            if (option2 == 1) {
                                contacts[i] = null;

                                int cc = UserInput.readCc("Introduza o CC: ");
                                int[] date = DateFuncts.readDDMMYY("Introduza uma data no formato DD/MM/YYYY: ");

                                contacts[count] = new Contactos(nome, cc, new DateYMD(date[0], date[1], date[2]));
                                break;
                            }
                        }
                    }
                    int cc = UserInput.readCc("Introduza o CC: ");
                    int[] date = DateFuncts.readDDMMYY("Introduza a data no formato DD/MM/YYYY");
                    contacts[count] = new Contactos(nome, cc, new DateYMD(date[0], date[1], date[2]));
                }
                case 2 -> {
                    option2 = UserInput.readIntClosed(1, 2, "1 - Pesquisa por nome\n2 - Pesquisa por número");
                    switch (option2) {
                        case 1 -> {
                            String name = UserInput.readName("Nome? ");
                            count = checkNameRefs(name, contacts);
                            if (checkNameRefs(name, contacts) == 0)
                                System.out.println("Contacto não existe");
                            else if (checkNameRefs(name, contacts) == 1) {
                                int pos = getContactPosByName(name, contacts);
                                contacts[pos].setNumber();
                                contacts[pos].setEmail();
                                contacts[pos].setDataNasc();
                                contacts[pos].setName();
                                contacts[pos].setCc(); // set all parameters
                            } else {
                                changeByID(contacts, count);
                            }
                        }
                        case 2 -> {
                            int number = UserInput.readNumber("Número? ");
                            count = checkNumberRefs(number, contacts);
                            if (checkNumberRefs(number, contacts) == 0)
                                System.out.println("Contacto não existe");
                            else if (checkNumberRefs(number, contacts) == 1) {
                                int pos = getContactPosByNumber(number, contacts);
                                contacts[pos].setNumber();
                                contacts[pos].setEmail();
                                contacts[pos].setDataNasc();
                                contacts[pos].setName();
                                contacts[pos].setCc(); // set all parameters
                            } else {
                                changeByID(contacts, count);
                            }
                        }
                    }
                }
                case 3 -> {
                    option2 = UserInput.readIntClosed(1, 2, "1 - Apagar por nome\n2 - Apagar por número");
                    switch (option2) {
                        case 1 -> {
                            String name = UserInput.readName("Nome? ");
                            count = checkNameRefs(name, contacts);
                            if (checkNameRefs(name, contacts) == 0)
                                System.out.println("Contacto não existe");
                            else if (checkNameRefs(name, contacts) == 1) {
                                int pos = getContactPosByName(name, contacts);
                                contacts[pos] = null;
                            } else {
                                deleteByID(contacts, count);
                            }
                        }
                        case 2 -> {
                            int number = UserInput.readNumber("Número? ");
                            count = checkNumberRefs(number, contacts);
                            if (checkNumberRefs(number, contacts) == 0)
                                System.out.println("Contacto não existe");
                            else if (checkNumberRefs(number, contacts) == 1) {
                                int pos = getContactPosByNumber(number, contacts);
                                contacts[pos] = null;
                            } else deleteByID(contacts, count);
                        }
                    }
                }
                case 4 -> {
                    option2 = UserInput.readIntClosed(1, 2, "1 - Pesquisa por nome\n2 - Pesquisa por número");
                    switch (option2) {
                        case 1 -> {
                            String name = UserInput.readName("Nome? ");
                            count = checkNameRefs(name, contacts);
                            if (checkNameRefs(name, contacts) == 0)
                                System.out.println("Contacto não existe");
                            else if (checkNameRefs(name, contacts) == 1) {
                                int pos = getContactPosByName(name, contacts);
                                System.out.println(contacts[pos]);
                            } else {
                                System.out.println("Contacto existe mais que uma vez");
                                int id = UserInput.readIntClosed(1, count, "Qual o contacto que pretende mostrar (ID)? ");
                                int pos = getContactPosByID(id, contacts);
                                System.out.println(contacts[pos]);
                            }
                        }
                        case 2 -> {
                            int number = UserInput.readNumber("Número? ");
                            count = checkNumberRefs(number, contacts);
                            if (checkNumberRefs(number, contacts) == 0)
                                System.out.println("Contacto não existe");
                            else if (checkNumberRefs(number, contacts) == 1) {
                                int pos = getContactPosByNumber(number, contacts);
                                System.out.println(contacts[pos]);
                            } else {
                                System.out.println("Contacto existe mais que uma vez");
                                int id = UserInput.readIntClosed(1, count, "Qual o contacto que pretende mostrar (ID)? ");
                                int pos = getContactPosByID(id, contacts);
                                System.out.println(contacts[pos]);
                            }
                        }
                    }
                }
                case 5 -> {
                    for (int i = 0; i < contacts.length; i++) {
                        if (contacts[i] != null)
                            System.out.println(contacts[i]);
                    }
                }
            }

        }
    }

    private static void changeByID(Contactos[] contacts, int count) {
        System.out.println("Contacto existe mais que uma vez");
        int id = UserInput.readIntClosed(1, count, "Qual o contacto que pretende alterar (ID)? ");
        int pos = getContactPosByID(id, contacts);

        contacts[pos].setNumber();
        contacts[pos].setEmail();
        contacts[pos].setDataNasc();
        contacts[pos].setName();
        contacts[pos].setCc(); // set all parameters
    }

    private static void deleteByID(Contactos[] contacts, int count){
        System.out.println("Contacto existe mais que uma vez");
        int id = UserInput.readIntClosed(1, count, "Qual o contacto que pretende alterar (ID)? ");
        int pos = getContactPosByID(id, contacts);
        contacts[pos] = null;
    }

    private static int checkNameRefs(String name, Contactos[] contacts){
        int count = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getName().equals(name)){
                count++;
                System.out.println(contacts[i]);
            }
        }
        return count;
    }

    private static int checkNumberRefs(int number, Contactos[] contacts){
        int count = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getNumber() == number){
                count++;
                System.out.println(contacts[i]);
            }
        }
        return count;
    }

    private static int getContactPosByID(int id, Contactos[] contacts){
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getID() == id)
                return i;
        }
        return -1;
    }

    private static int getContactPosByName(String name, Contactos[] contacts){
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private static int getContactPosByNumber(int number, Contactos[] contacts){
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getNumber() == number){
                return i;
            }
        }
        return -1;
    }
}
