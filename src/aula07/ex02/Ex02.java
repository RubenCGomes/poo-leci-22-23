package aula07.ex02;

import java.util.Scanner;

import aula05.DateYMD;
import utils.*;

public class Ex02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            int option1 = UserInput.readIntClosed(0, 2, "Introduza uma opção (1 - DateYMD / 2 - DateND / 0 - sair)");
            switch (option1) {
                case 0 -> {
                    System.out.println("A sair...");
                    System.exit(0);
                }
                case 1 -> {
                    DateYMD date = null;
                    int option2 = UserInput.readIntClosed(0, 6, "Date operations:\n1 - create new date\n2 - show current date\n3 - set new date\n4 - increment date\n5 - decrement date\n6 - print date\n0 - exit");
                    switch (option2) {
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
                case 2 -> {
                    DateND date = null;
                    int option2 = UserInput.readIntClosed(0, 6, "Date operations:\n1 - create new date\n2 - show current date\n3 - set new date\n4 - increment date\n5 - decrement date\n6 - print date\n0 - exit");
                    switch (option2) {
                        case 0 -> {
                            System.out.println("Exiting...");
                            System.exit(0);
                        }
                        case 1 -> {
                            int day = UserInput.readIntClosed(1, 31, "Days: ");
                            if (day > 0) date = new DateND(day);
                            else System.out.println("Invalid date, try again");
                        }
                        case 2 -> {
                            assert date != null;
                            System.out.println("Current date: " + date.getDate()[0] + "/" + date.getDate()[1] + "/" + date.getDate()[2]);
                        }
                        case 3 -> {
                            assert date != null;
                            int newDay = UserInput.readIntClosed(1, 31, "Days: ");
                            if (newDay > 0) date.setDate(newDay);
                            else System.out.println("Invalid date, try again");
                        }
                        case 4 -> {
                            if (date != null) date.increment();
                            else System.out.println("Date not initialized");
                        }
                        case 5 -> {
                            if (date != null) date.decrement();
                            else System.out.println("Date not initialized");
                        }
                        case 6 -> {
                            if (date != null) System.out.println(date);
                            else System.out.println("Date not initialized");
                        }
                    }
                }
            }
        }
    }
}
