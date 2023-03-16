package utils;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

/*Takes a string of a date, validates the format, splits, validates values and returns array of month and year(in int)*/
public class DateFuncts {
    public static int[] validateDate(String message){
        while (true) {
            Scanner inp = new Scanner(System.in);
            System.out.println(message);
            String date = inp.next();

            if (!date.matches("\\d{2}/\\d{4}$") && (!date.matches("\\d/\\d{4}$"))){
                System.out.println("Data inválida");
                continue;
            }

            String[] array = date.split("/");
            int month = parseInt(array[0]);
            int year = parseInt(array[1]);

            if (month < 0 || month > 13) {
                System.out.println("Data inválida");
                continue;
            }
            if (year < 0) {
                System.out.println("Data inválida");
                continue;
            }
            return new int[]{month, year};
        }
    }
    public static int daysInMonth(int month, int year){
        int days;
        boolean leapyear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        switch (month){
            case 2:
                if (leapyear) days = 29;
                else days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        return days;
    }

    public static void printCalendar(int days, int month, int year, int pos){
        String extmonth = "";
        switch (month){
            case 1 : extmonth = "January"; break;
            case 2 : extmonth = "February"; break;
            case 3 : extmonth = "March"; break;
            case 4 : extmonth = "April"; break;
            case 5 : extmonth = "May"; break;
            case 6 : extmonth = "June"; break;
            case 7 : extmonth = "July"; break;
            case 8 : extmonth = "August"; break;
            case 9 : extmonth = "September"; break;
            case 10: extmonth = "October"; break;
            case 11: extmonth = "November"; break;
            case 12: extmonth = "December"; break;
        }
        System.out.printf("%16s\n", extmonth + " " + year);
        System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n", "Su","Mo","Tu","We","Th","Fr","Sa");

        int count = 0;
        while (count < pos - 1){
            count++;
            System.out.print("   ");
        }

        for (int i = 1; i < days + 1; i++) {
            System.out.printf("%3d", i);
            if ((i + pos - 1) % 7 == 0)
                System.out.println();
        }
    }
    public static int[] readDDMM(String message) {
        while (true) {
            Scanner inp = new Scanner(System.in);
            System.out.println(message);
            String date = inp.next();

            if (date.equals("0")) return new int[]{0};

            if (!date.matches("\\d{1,2}/\\d{1,2}$")) {
                System.out.println("Data inválida");
                continue;
            }

            String[] array = date.split("/");
            int day = parseInt(array[0]);
            int month = parseInt(array[1]);
            return new int[]{day, month};
        }
    }
}
