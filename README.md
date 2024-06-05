# Car Rental System

This is a simple console-based Car Rental System implemented in Java. The system allows users to add cars, rent them, return them, and display rental history. This project demonstrates basic object-oriented programming principles in Java and offers a simple user interface for interacting with the car rental service.

## Features

- **Add Car**: Allows adding new cars to the rental fleet with details such as ID, make, model, and rental price.
- **Display Available Cars**: Lists all cars that are currently available for rent.
- **Rent a Car**: Rents a car by setting its availability status to `false` and logs the transaction.
- **Return a Car**: Returns a rented car by setting its availability status back to `true` and logs the transaction.
- **Display Rental History**: Displays the history of all rental and return transactions.

## Classes and Methods

### `Car`
Represents a car in the rental system.
- **Fields**:
  - `int carId`: Unique identifier for the car.
  - `String make`: Make of the car.
  - `String model`: Model of the car.
  - `double rentalPrice`: Rental price per day.
  - `boolean isAvailable`: Availability status of the car.
- **Constructor**:
  - `Car(int carId, String make, String model, double rentalPrice)`: Initializes a new car with the given details.
- **Methods**:
  - `String toString()`: Returns a string representation of the car details.

### `CarRentalSystem`
Handles the operations of the car rental system.
- **Fields**:
  - `List<Car> cars`: List of all cars in the system.
  - `List<String> rentalHistory`: List of rental and return transactions.
  - `Scanner in`: Scanner object for reading user input.
- **Constructor**:
  - `CarRentalSystem()`: Initializes the car list, rental history, and scanner.
- **Methods**:
  - `void addCar()`: Prompts the user to enter car details and adds a new car to the system.
  - `void displayAvailableCars()`: Displays all cars that are available for rent.
  - `void rentCar()`: Prompts the user to enter a car ID and rents the car if available.
  - `void returnCar()`: Prompts the user to enter a car ID and returns the car if it was rented.
  - `void displayRentalHistory()`: Displays the history of all rental and return transactions.
  - `void menu()`: Displays the menu and handles user input for different operations.

### `Main`
The entry point of the application.
- **Methods**:
  - `public static void main(String[] args)`: Creates an instance of `CarRentalSystem` and starts the menu.

## How to Run

1. Clone the repository to your local machine:
   ```sh
   git clone https://github.com/your-alienware-007/car-rental-system.git
