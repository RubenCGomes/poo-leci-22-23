package utils;

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
}
