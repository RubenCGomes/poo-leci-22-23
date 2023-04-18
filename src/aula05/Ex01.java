package aula05;

import utils.classes.UserInput;

public class Ex01 {
    public static void main(String[] args){
        DateYMD date = null;
        while (true){
            int option = UserInput.readIntClosed(0, 6, "Date operations:\n1 - create new date\n2 - show current date\n3 - set new date\n4 - increment date\n5 - decrement date\n6 - print date\n0 - exit");
            switch (option) {
                case 0 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                case 1 -> {
                    int day = UserInput.readIntClosed(1, 31, "Day: ");
                    int month = UserInput.readIntClosed(1, 12, "Month: ");
                    int year = UserInput.readIntClosed(1000, 9999, "Year: ");
                    if (DateYMD.valid(day, month, year)) {
                        date = new DateYMD(day, month, year);
                    } else {
                        System.out.println("Invalid date, try again");
                    }
                }
                case 2 -> {
                    assert date != null;
                    System.out.println("Current date: " + date.getDate()[0] + "/" + date.getDate()[1] + "/" + date.getDate()[2]);
                }
                case 3 -> {
                    assert date != null;
                    int newDay = UserInput.readIntClosed(1, 31, "Day: ");
                    int newMonth = UserInput.readIntClosed(1, 12, "Month: ");
                    int newYear = UserInput.readIntClosed(1000, 9999, "Year: ");
                    if (DateYMD.valid(newDay, newMonth, newYear)) {
                        date.setDate(newDay, newMonth, newYear);
                    } else {
                        System.out.println("Invalid date, try again");
                    }
                }
                case 4 -> {
                    assert date != null;
                    date.increment();
                }
                case 5 -> {
                    assert date != null;
                    date.decrement();
                }
                case 6 -> {
                    assert date != null;
                    System.out.println(date);
                }
            }
        }
    }
}
