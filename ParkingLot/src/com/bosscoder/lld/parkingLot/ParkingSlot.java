package com.bosscoder.lld.parkingLot;

public abstract class ParkingSlot {

    //Vehicle --> aggregation
    // slot number
    // isFree
    // type : SlotType


    // isFree()
    private String number;
    private boolean free;
    private Vehicle vehicle;
    private final SlotType type;

    public SlotType getType() {
        return type;
    }

    public ParkingSlot(SlotType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

class SpeciallyAbledSlot extends ParkingSlot{
    public SpeciallyAbledSlot(SlotType type) {
        super(SlotType.SPECIAL);
    }
}

class CarSlot extends ParkingSlot{
    public CarSlot() {
        super(SlotType.CAR);
    }
}

class BikeSlot extends ParkingSlot{
    public BikeSlot() {
        super(SlotType.BIKE);
    }
}


