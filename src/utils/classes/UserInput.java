package utils.classes;

import java.util.Scanner;

public class UserInput {
    /*For closed int intervals*/
    public static int readIntClosed(double min, double max, String message){
        System.out.println(message);
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        while (min > number || number > max){
            System.out.println(message);
            number = inp.nextInt();
        }
        return number;
    }

    /*For open int intervals*/
    public static int readIntOpen(double min, double max, String message){
        System.out.println(message);
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        while (min >= number || number >= max){
            System.out.println(message);
            number = inp.nextInt();
        }
        return number;
    }

    /*For closed double intervals*/
    public static double readDoubleClosed(double min, double max, String message){
        System.out.println(message);
        Scanner inp = new Scanner(System.in);
        double number = inp.nextDouble();
        while (min > number || number > max){
            System.out.println(message);
            number = inp.nextDouble();
        }
        return number;
    }

    /*For open double intervals*/
    public static double readDoubleOpen(double min, double max, String message){
        System.out.println(message);
        Scanner inp = new Scanner(System.in);
        double number = inp.nextDouble();
        while (min >= number || number >= max){
            System.out.println(message);
            number = inp.nextDouble();
        }
        return number;
    }

    /*Read a email with the following format: <name>@<domain>.<extension>*/
    public static String readEmail(String message){
        System.out.println(message);
        Scanner inp = new Scanner(System.in);
        String email = inp.nextLine();
        while (!email.matches("^[a-zA-Z_0-9]+@[a-zA-Z]+\\.+[a-zA-Z]+$")){
            System.out.println("Email inválido");
            System.out.println(message);
            email = inp.nextLine();
        }
        return email;
    }

    /*Read a phone number with 9 digits that begins with 9*/
    public static int readNumber(String message){
        System.out.println(message);
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        while (!String.valueOf(number).matches("9\\d{8}")){
            System.out.println("Número inválido");
            System.out.println(message);
            number = inp.nextInt();
        }
        return number;
    }

    /*Reads a name*/
    public static String readName(String message){
        System.out.println(message);
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        while (!name.matches("[ A-Za-z]+")){
            System.out.println("Nome inválido");
            System.out.println(message);
            name = inp.nextLine();
        }
        return name;
    }

    /*Reads a valid CC*/
    public static int readCc(String message){
        System.out.println(message);
        Scanner inp = new Scanner(System.in);
        int cc = inp.nextInt();
        while (!(String.valueOf(cc).length() == 8)){
            System.out.println("CC inválido");
            System.out.println(message);
            cc = inp.nextInt();
        }
        return cc;
    }

    /*Reads a valid registration*/
    public static boolean validRegistration(String registration){
        return (registration.matches("^[A-Z]{2}-\\d{2}-\\d{2}|\\d{2}-[A-Z]{2}-\\d{2}|\\d{2}-\\d{2}-[A-Z]{2}|[A-Z]{2}-\\d{2}-[A-Z]{2}|[A-Z]{2}-[A-Z]{2}-\\d{2}|\\d{2}-[A-Z]{2}-[A-Z]{2}$"));
    }
}
