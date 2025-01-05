package Class22.MainVehicle;

// Vehicle ক্লাস
class Vehicle {
    public void speedUp() {
        System.out.println("Vehicle is speeding up");
    }
}

// Car ক্লাস (Vehicle থেকে ইনহেরিট)
class Car extends Vehicle {
    @Override
    public void speedUp() {
        System.out.println("Car is speeding up by 20 km/h");
    }
}

// Bicycle ক্লাস (Vehicle থেকে ইনহেরিট)
class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        System.out.println("Bicycle is speeding up by 5 km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        vehicle.speedUp();       // Vehicle এর speedUp() মেথড
        car.speedUp();           // Car এর speedUp() মেথড
        bicycle.speedUp();       // Bicycle এর speedUp() মেথড
    }
}
