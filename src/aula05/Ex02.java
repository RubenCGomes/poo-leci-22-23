package aula05;

import utils.classes.UserInput;

public class Ex02 {
    public static void main(String[] args){
        Calendar calendar = null;
        while (true){
            int option = UserInput.readIntClosed(0, 5, "Date operations:\n1 - create new calendar\n2 - print calendar month\n3 - print calendar\n4 - add event\n5 - remove event\n0 - exit");
            switch (option){
                case 0 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                case 1 -> {
                    int pos = UserInput.readIntClosed(1, 7, "Which day of the week does the year start? ");
                    int year = UserInput.readIntClosed(1000, 9999, "Year: ");
                    calendar = new Calendar(year, pos);
                }
                case 2 -> {
                    assert calendar != null;
                    int month = UserInput.readIntClosed(1, 12, "Month to show: ");
                    calendar.printMonth(month);
                }
                case 3 -> {
                    assert calendar != null;
                    calendar.printCalendar();
                }
                case 4 -> {
                    assert calendar != null;
                    int day = UserInput.readIntClosed(1, 31, "Day: ");
                    int month = UserInput.readIntClosed(1, 12, "Month: ");
                    int year = UserInput.readIntClosed(1000, 9999, "Year: ");

                    DateYMD date = new DateYMD(day, month, year);
                    calendar.addEvent(date);
                }
                case 5 -> {
                    assert calendar != null;
                    int day = UserInput.readIntClosed(1, 31, "Day: ");
                    int month = UserInput.readIntClosed(1, 12, "Month: ");
                    int year = UserInput.readIntClosed(1000, 9999, "Year: ");

                    DateYMD date = new DateYMD(day, month, year);
                    calendar.removeEvent(date);
                }
            }
        }
    }
}
