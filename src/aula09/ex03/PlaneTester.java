package aula09.ex03;

import java.util.ArrayList;
import java.util.Scanner;
import aula09.ex03.classes.*;
import aula09.ex03.enums.PlaneType;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addPlane(planeManager, scanner);
                case 2 ->removePlane(planeManager, scanner);
                case 3 -> searchPlane(planeManager, scanner);
                case 4 -> printAllPlanes(planeManager);
                case 5 -> printCommercialPlanes(planeManager);
                case 6 -> printMilitaryPlanes(planeManager);
                case 7 -> printFastestPlane(planeManager);
                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addPlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("ID? ");
        String id = scanner.next();
        System.out.println("Maker? ");
        String maker = scanner.next();
        System.out.println("Model? ");
        String model = scanner.next();
        System.out.println("Production year? ");
//        scanner.next();
        int production = scanner.nextInt();
        System.out.println("Max passengers? ");
        int passengers = scanner.nextInt();
        System.out.println("Max speed?");
        int speed = scanner.nextInt();
        System.out.println("Type of plane? (1 - Commercial, 2 - Military)");
        int option1 = scanner.nextInt();
        switch (option1) {
            case 1 -> {
                System.out.println("Crew members? ");
                int numTrip = scanner.nextInt();
                CommercialPlane plane = new CommercialPlane(id, maker, model, production, passengers, speed, numTrip);
                planeManager.addPlane(plane);
                System.out.println("Added " + plane);
            }
            case 2 -> {
                System.out.println("Number of munitions? ");
                int numMissiles = scanner.nextInt();
                MilitaryPlane plane = new MilitaryPlane(id, maker, model, production, passengers, speed, numMissiles);
                planeManager.addPlane(plane);
                System.out.println("Added " + plane);
            }
            default -> System.out.println("Invalid option");
        }
    }

    private static void removePlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("ID? ");
        String id = scanner.next();

        if (planeManager.searchPlane(id) == null)
            System.out.println("Invalid plane");
        else {
            System.out.println("Removed " + planeManager.searchPlane(id));
            planeManager.removePlane(id);
        }
    }

    private static void searchPlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("ID? ");
        String id = scanner.next();

        if (planeManager.searchPlane(id) == null) System.out.println("Invalid plane");
        else  System.out.println(planeManager.searchPlane(id));
    }

    private static void printAllPlanes(PlaneManager planeManager) {
        planeManager.printAllPlanes();
    }

    private static void printCommercialPlanes(PlaneManager planeManager) {
        ArrayList list = planeManager.getCommercialPlanes();

        for (Object plane : list ) {
            System.out.println(plane);
        }
    }

    private static void printMilitaryPlanes(PlaneManager planeManager) {
        ArrayList list = planeManager.getMilitaryPlanes();

        for (Object plane : list ) {
            System.out.println(plane);
        }
    }

    private static void printFastestPlane(PlaneManager planeManager) {
        System.out.println(planeManager.getFastestPlane());
    }
}
