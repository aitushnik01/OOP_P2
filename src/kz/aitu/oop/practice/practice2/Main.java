package kz.aitu.oop.practice.practice2;
import kz.aitu.oop.practice.practice2.trains.Train;
import kz.aitu.oop.practice.practice2.wagons.Luxury;
import kz.aitu.oop.practice.practice2.wagons.Couchette;
import kz.aitu.oop.practice.practice2.wagons.Coupe;
import kz.aitu.oop.practice.practice2.wagons.Wagon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Train train1 = new Train("Road Astana","Astana -- Atyrau",1300,15,150);
        Train train2 = new Train("Bek Road","Almaty -- Qaskelen",50,50,80);
        Train train3 = new Train("Qazaq Road","Konaev -- Almaty",200,45,100);
        for (int i = 1; i <= 5; i++) {
            Luxury luxury = new Luxury("Lux" + i, 5);
            train1.addWagon(luxury);
            train2.addWagon(luxury);
            train3.addWagon(luxury);
            Coupe coupe = new Coupe("Cou" + i, 10);
            train1.addWagon(coupe);
            train2.addWagon(coupe);
            train3.addWagon(coupe);
            Couchette couchette = new Couchette("Couch" + i, 60);
            train1.addWagon(couchette);
            train2.addWagon(couchette);
            train3.addWagon(couchette);
        }


        while (true) {
            System.out.println("-------HELLO----WORLD-------");
            System.out.println("1. Dobavit' wagon");
            System.out.println("2. Ubrat' Wagon.");
            System.out.println("3. Uznat' more about wagon");
            System.out.println("4. Uznat' tyaga of locomotive");
            System.out.println("5. Uznat' capacity of specific wagon");
            System.out.println("6. Leave.");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if( choice == 6){
                break;
            }

            System.out.println("Vyberi Train (1 or 2 or 3): ");
            int trainChoice = scanner.nextInt();
            scanner.nextLine();

            Train selectedTrain;
            if (trainChoice == 1) {
                selectedTrain = train1;
            } else if (trainChoice == 2){
                selectedTrain = train2;
            }
            else{
                selectedTrain = train3;
            }

            if (choice == 1) {
                System.out.print("Enter Wagon Type (VIP - 1, COMFORT - 2, SIMPLE - 3): ");
                String type = scanner.nextLine();
                System.out.print("Enter Wagon ID: ");
                String id = scanner.nextLine();
                switch (type) {
                    case "1":
                        Luxury luxury = new Luxury(id, 5);
                        selectedTrain.addWagon(luxury);
                        break;
                    case "2":
                        Coupe coupe = new Coupe(id, 10);
                        selectedTrain.addWagon(coupe);
                        break;
                    case "3":
                        Couchette couchette = new Couchette(id, 60);
                        selectedTrain.addWagon(couchette);
                        break;
                }
            } else if (choice == 2) {
                System.out.print("Enter Wagon ID: ");
                String id = scanner.nextLine();
                for (Wagon wagon : selectedTrain.getWagons()) {
                    if (wagon.getId().equals(id)) {
                        selectedTrain.removeWagon(wagon);
                        break;
                    }
                }
            } else if (choice == 3) {
                System.out.println("Total Train Vmestimost': " + selectedTrain.getTotalCapacity());
                System.out.println("Train Speed: " + selectedTrain.getSpeed() + "km/h");
                int distance = selectedTrain.getDistance();
                System.out.println(selectedTrain.getName());
                System.out.println("Travel Time: " + selectedTrain.getTravelTime(distance) + " hours");
                System.out.println("Wagon Types and Counts:");
                System.out.println("Luxury: " + selectedTrain.getWagonCount("Luxury"));
                System.out.println("Coupe: " + selectedTrain.getWagonCount("Coupe"));
                System.out.println("Couchette: " + selectedTrain.getWagonCount("Couchette"));
            } else if (choice == 5){
                System.out.println("Luxury - 5");
                System.out.println("Coupe - 10");
                System.out.println("Couchette - 60");
            } else if (choice == 4){
                System.out.println("Tyaga locomotiva "+selectedTrain.getName()+" is "+selectedTrain.getCarryingCapacity());
            }
             else {
                System.out.println("Schitat' Nauchis'");
            }
        }
    }
}