package utils;

import java.util.Scanner;

public class UserInput {
    /*For closed intervals*/
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
    /*For open intervals*/
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
}
