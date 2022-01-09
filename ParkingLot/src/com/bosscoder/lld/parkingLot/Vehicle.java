package com.bosscoder.lld.parkingLot;

public abstract class Vehicle {

    private String regNo;
    private final VehicleType type;
    private ParkingTicket ticket;

    public Vehicle(VehicleType type) {
        this.type = type;
    }

    public void assignTicket(ParkingTicket ticket){
        this.ticket = ticket;
    }
}

class Car extends Vehicle{

    public Car(VehicleType type) {
        super(VehicleType.CAR);
    }
}

class Bike extends Vehicle{

    public Bike(VehicleType type) {
        super(VehicleType.BIKE);
    }
}
