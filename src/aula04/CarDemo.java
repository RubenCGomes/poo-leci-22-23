package aula04;

import java.util.Scanner;

class Car2 {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car2(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms += distance;
    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car2[] cars) {
        // TODO: pede dados dos carros ao utilizador e acrescenta ao vetor
        // registo de carros termina quando o utilizador inserir uma linha vazia 
        // devolve número de carros registados
        int count = 0;
        while (true){
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            String[] lst = line.split(" ");
            if (lst.length < 4) {
                System.out.println("Dados mal formatados. Tente novamente.");
                continue;
            }
            if ((Integer.parseInt(lst[lst.length- 2]) < 0 && lst[lst.length - 2].length() < 4) || Integer.parseInt(lst[lst.length - 1]) < 0){
                System.out.println("Dados mal formatados. Tente novamente.");
                continue;
            }
            try { cars[count] = new Car2(lst[0], lst[1], Integer.parseInt(lst[lst.length - 2]), Integer.parseInt(lst[lst.length - 1])); }
            catch (Exception e){
                System.out.println("Dados mal formatados. Tente novamente.");
                continue;
            }
            count++;
        }
        return count;
   }

    static void registerTrips(Car2[] cars, int numCars) {
        // TODO: pede dados das viagens ao utilizador e atualiza informação do carro
        // registo de viagens termina quando o utilizador inserir uma linha vazia
        while (true){
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            if (!line.matches("\\d+:\\d+")){
                System.out.println("Dados mal formatados. Tente novamente.");
                continue;
            }
            String[] lst = line.split(":");
            int car = Integer.parseInt(lst[0]);
            int distance = Integer.parseInt(lst[1]);
            if (car < 0 || distance < 0 || car > numCars - 1){
                System.out.println("Dados mal formatados. Tente novamente.");
            }
        }
    }

    static void listCars(Car2[] cars) {
        System.out.println("\nCarros registados: ");
        // Exemplo de resultado
        // Carros registados: 
        // Toyota Camry, 2010, kms: 234346
        // Renault Megane Sport Tourer, 2015, kms: 32536

        for (int i = 0; i < cars.length; i++){
            if (cars[i] == null) break;
            System.out.println(cars[i].make + " " + cars[i].model + ", " + cars[i].year + ", kms: " + cars[i].kms);
        }
    }

    public static void main(String[] args) {
        Car2[] cars = new Car2[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }
        sc.close();
    }
}
