/* Diego Martinez | 6401977
Dr. Xian Su
Homework #2
February 10, 2025
*/

interface Vehicle {
    void startEngine(); // Abstract method to be implemented
}

// Car class implementing Vehicle
class Car implements Vehicle {
    private String model; // Private field for model
    private int speed; // Private field for speed

    // Constructor to initialize model and speed
    public Car(String model, int speed) {
        this.model = model;
        setSpeed(speed); // Use setter for validation
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Setter for speed with validation (must be >= 0)
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Error: Speed cannot be negative.");
        }
    }

    // Implement startEngine method from Vehicle interface
    @Override
    public void startEngine() {
        System.out.println("The engine of " + model + " is starting!");
    }
}

// ElectricCar subclass extending Car
class ElectricCar extends Car {
    // Constructor for ElectricCar
    public ElectricCar(String model, int speed) {
        super(model, speed);
    }

    // Override startEngine for ElectricCar
    @Override
    public void startEngine() {
        System.out.println("The electric engine of " + getModel() + " is starting!");
    }
}

// GasCar subclass extending Car
class GasCar extends Car {
    // Constructor for GasCar
    public GasCar(String model, int speed) {
        super(model, speed);
    }

    // Override startEngine for GasCar
    @Override
    public void startEngine() {
        System.out.println("The gas engine of " + getModel() + " is starting!");
    }
}

public class Interfaces_and_Encapsulation {
    public static void main(String[] args) {
        // Create instances of ElectricCar and GasCar
        Car myElectricCar = new ElectricCar("Tesla Model S", 0);
        Car myGasCar = new GasCar("Ford Mustang", 0);

        // Set speed using setter
        myElectricCar.setSpeed(60);
        myGasCar.setSpeed(80);

        // Call startEngine() for both cars
        myElectricCar.startEngine();
        myGasCar.startEngine();
    }
}
