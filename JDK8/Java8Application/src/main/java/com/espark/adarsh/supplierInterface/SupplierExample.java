package com.espark.adarsh.supplierInterface;

import java.util.function.Supplier;

/**
 * Created by Adarsh on 6/23/15.
 */
public class SupplierExample {
    public static void main(String[] args) {

        final VehicleFactory vehicleFactory = new VehicleFactory();

        final Vehicle vehicleCar1 = vehicleFactory.buildVehicle(() -> new Car());
        vehicleCar1.getVehicle();
        final Vehicle vehicleCar2 = vehicleFactory.buildVehicle(() -> new Car("BMW"));
        vehicleCar2.getVehicle();

        final Vehicle vehicleBus1 = vehicleFactory.buildVehicle(() -> new Bus());
        vehicleBus1.getVehicle();
        final Vehicle vehicleBus2 = vehicleFactory.buildVehicle(() -> new Bus("Volvo"));
        vehicleBus2.getVehicle();

        final Vehicle vehicleTruck1 = vehicleFactory.buildVehicle(() -> new Truck());
        vehicleTruck1.getVehicle();
        final Vehicle vehicleTruck2 = vehicleFactory.buildVehicle(() -> new Truck("CAT"));
        vehicleTruck2.getVehicle();

        final GenericVehicleFactory<Vehicle> genericVehicleFactory=new GenericVehicleFactory<Vehicle>();

        final Vehicle vehicleCar11 = genericVehicleFactory.build(() -> new Car());
        vehicleCar11.getVehicle();
        final Vehicle vehicleCar22 = genericVehicleFactory.build(() -> new Car("BMW"));
        vehicleCar22.getVehicle();

        final Vehicle vehicleBus11 = genericVehicleFactory.build(() -> new Bus());
        vehicleBus11.getVehicle();
        final Vehicle vehicleBus22 = genericVehicleFactory.build(() -> new Bus("Volvo"));
        vehicleBus22.getVehicle();

        final Vehicle vehicleTruck11 = genericVehicleFactory.build(() -> new Truck());
        vehicleTruck11.getVehicle();
        final Vehicle vehicleTruck22 = genericVehicleFactory.build(() -> new Truck("CAT"));
        vehicleTruck22.getVehicle();
    }
}

interface Vehicle {
    public void getVehicle();
}

class Car implements Vehicle {

    private String vehicleName;

    public Car() {
    }

    public Car(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Override
    public void getVehicle() {
        System.out.println("Car " + vehicleName);
    }

    @Override
    public String toString() {
        return "Car " + vehicleName;
    }
}

class Bus implements Vehicle {

    private String vehicleName;

    public Bus() {
    }

    public Bus(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Override
    public void getVehicle() {
        System.out.println("Bus " + vehicleName);
    }

    @Override
    public String toString() {
        return "Bus " + vehicleName;
    }
}

class Truck implements Vehicle {

    private String vehicleName;

    public Truck() {
    }

    public Truck(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Override
    public void getVehicle() {
        System.out.println("Truck " + vehicleName);
    }

    @Override
    public String toString() {
        return "Truck " + vehicleName;
    }
}


class VehicleFactory {
    public Vehicle buildVehicle(Supplier<? extends Vehicle> supplier) {
        final Vehicle vehicle = supplier.get();
        System.out.println(vehicle + " build in VehicleFactory");
        return vehicle;
    }
}

class GenericVehicleFactory<T> {

    public T build(Supplier<? extends T> supplier) {
        final T object = supplier.get();
        System.out.println(object + " Build in GenericVehicleFactory");
        return object;
    }
}