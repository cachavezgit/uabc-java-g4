package mx.uabc.cursojava.designpatterns;

abstract class Vehicle {

}

class Car extends Vehicle {

}

class Bike extends Vehicle {

}

class Truck extends Vehicle {

}

enum VehicleType {
    Bike, Car, Truck
}

public class VehicleFactory {
    public static Vehicle create(VehicleType type) {
        if (type.equals(VehicleType.Bike))
            return new Bike();
        if (type.equals(VehicleType.Car))
            return new Car();
        if (type.equals(VehicleType.Truck))
            return new Car();
        else
            return null;
    }
}