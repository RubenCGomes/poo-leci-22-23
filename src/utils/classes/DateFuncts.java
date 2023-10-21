package utils.classes;

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
        switch (month) {
            case 2 -> {
                if (leapyear) days = 29;
                else days = 28;
            }
            case 4, 6, 9, 11 -> days = 30;
            default -> days = 31;
        }
        return days;
    }

    public static void printCalendar(int days, int month, int year, int pos){
        String extmonth = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
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
    public static int[] readDDMMYY(String message){
        while (true) {
            Scanner inp = new Scanner(System.in);
            System.out.println(message);
            String date = inp.next();

            if (!date.matches("\\d{1,2}/\\d{1,2}/\\d{4}$")) {
                System.out.println("Data inválida");
                continue;
            }

            String[] array = date.split("/");
            int day = parseInt(array[0]);
            int month = parseInt(array[1]);
            int year = parseInt(array[2]);

            return new int[]{day, month, year};
        }
    }
}
