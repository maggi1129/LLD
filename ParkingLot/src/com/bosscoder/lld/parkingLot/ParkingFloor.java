package com.bosscoder.lld.parkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloor {

    // id/name
    // display board -- composition board
    // maps of different types of slots
    // update board
    // addSlot
    // assignVehicleToSlot
    // freeSlot

    private String id;
    private Map<String,SpeciallyAbledSlot> speciallyAbledSlotMap ;
    private Map<String,CarSlot> carSlotMap ;
    private Map<String,BikeSlot> bikeSlotMap;
    private Display display;
    private boolean isFull;

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public ParkingFloor(String id) {
        this.id = id;
    }

    public void addParkingSpot(ParkingSlot slot){
        switch(slot.getType()){

        }
    }

    public  void assignVehicleToSpot(Vehicle vehicle, ParkingSlot slot){

    }

    private void UpdateDisplayBoard(ParkingSlot slot){

    }
    public void freeSpot(){

    }
}
