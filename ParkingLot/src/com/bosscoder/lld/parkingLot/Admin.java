package com.bosscoder.lld.parkingLot;

public class Admin extends UserAccount{

    public boolean addParkingFloor(ParkingFloor floor){

        return true;
    }

    public boolean addParkingSlot(ParkingFloor floor, ParkingSlot slot){

        return true;
    }

    public  boolean addParkingDisplay(ParkingFloor floor, Display display){

        return true;
    }

    public boolean addVehicleInfo(ParkingFloor floor, Vehicle vehicle){
        return  true;
    }

    public boolean addEntry(){
        return  true;
    }

    public  boolean addExit(){
        return true;
    }

    @Override
    public boolean resetPassword() {

        //Reset password functionality
        return true;
    }
}
