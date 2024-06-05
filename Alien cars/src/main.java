import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    int carId;
    String make;
    String model;
    double rentalPrice;
    boolean isAvailable;

    public Car(int carId, String make, String model, double rentalPrice) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return "Car ID: " + carId + ", Make: " + make + ", Model: " + model + ", Rental Price: " + rentalPrice + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}

class CarRentalSystem {
    private List<Car> cars;
    private List<String> rentalHistory;
    private Scanner in;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        rentalHistory = new ArrayList<>();
        in = new Scanner(System.in);
    }

    public void addCar() {
        System.out.print("Enter the Id: ");
        int carId = in.nextInt();
        in.nextLine();
        System.out.print("Enter The Car Make: ");
        String make = in.nextLine();
        System.out.print("Enter The Car Model: ");
        String model = in.nextLine();
        System.out.print("Enter The Car rental price: ");
        double rentalPrice = in.nextDouble();

        Car car = new Car(carId, make, model, rentalPrice);
        cars.add(car);
        System.out.println("Car added successfully!");
    }

    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (car.isAvailable) {
                System.out.println(car);
            }
        }
    }

    public void rentCar() {
        System.out.print("Enter the Id of the car you want to rent: ");
        int carId = in.nextInt();
        boolean found = false;

        for (Car car : cars) {
            if (car.carId == carId && car.isAvailable) {
                car.isAvailable = false;
                rentalHistory.add("Car ID: " + carId + " rented.");
                System.out.println("Car rented successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Car not available or invalid Id.");
        }
    }

    public void returnCar() {
        System.out.print("Enter the Id of the car you want to return: ");
        int carId = in.nextInt();
        boolean found = false;

        for (Car car : cars) {
            if (car.carId == carId && !car.isAvailable) {
                car.isAvailable = true;
                rentalHistory.add("Car ID: " + carId + " returned.");
                System.out.println("Car returned successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid Id or car not rented.");
        }
    }

    public void displayRentalHistory() {
        System.out.println("Rental History:");
        for (String record : rentalHistory) {
            System.out.println(record);
        }
    }

    public void menu() {
        int choice;

        while (true) {
            System.out.println(" \t===========================================================");
            System.out.printf("  \t\tALIEN RENTAL AGENCY\n");
            System.out.println(" \t===========================================================");

            System.out.println("\t\t\t 1. Add Car");
            System.out.println("\t\t\t 2. Display available cars");
            System.out.println("\t\t\t 3. Rent a car");
            System.out.println("\t\t\t 4. Return a car");
            System.out.println("\t\t\t 5. Display rental history");
            System.out.println("\t\t\t 0. Exit");

            System.out.print("\t\tChoose an option: ");
            choice = in.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting......");
                    in.close();
                    return;

                case 1:
                    addCar();
                    break;

                case 2:
                    displayAvailableCars();
                    break;

                case 3:
                    rentCar();
                    break;

                case 4:
                    returnCar();
                    break;

                case 5:
                    displayRentalHistory();
                    break;

                default:
                    System.out.println("Invalid Choice ... ");
                    break;
            }
        }
    }
}

public class main {
    public static void main(String[] args){
        CarRentalSystem system = new CarRentalSystem();
        system.menu();
    }
}
