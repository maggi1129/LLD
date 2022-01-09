package com.bosscoder.lld.parkingLot;

import java.util.List;
import java.util.Map;

public class ParkingLot {

    // Singleton
    // id
    // location
    // parking rate --> hourNumber , rate
    // entryPanels
    //exitPanels
    // floorList

    // isFull()
    //addFloors()
    // addExit()
    // addEntry()



     private String name;
     private Location address;
     private ParkingRate parkingRate;

     private Map<String, EntryPanel> entryPanelMap;
     private Map<String, ExitPanel> exitPanelMap;
     private Map<String, ParkingTicket> parkingTicketMap;
     private List<ParkingFloor> parkingFloorList;

     // List of any special slots or floors

     private static ParkingLot parkingLot;

     private ParkingLot(){
         //initialize the name, address, floors and special slots
     }

     public static ParkingLot getInstance(){
         if(parkingLot==null){
             synchronized(ParkingLot.class){
                 if(parkingLot==null){
                     parkingLot = new ParkingLot();
                 }
             }
         }

         return parkingLot;
     }
     public boolean isFull(){
         for(ParkingFloor floor: parkingFloorList){
             if(!floor.isFull()){
                 return  false;
             }
         }
         return true;
     }
     public boolean addParkingFloor(ParkingFloor floor){
         return true;
     }
     public ParkingTicket getNewParkingTicket(Vehicle vehicle) throws Exception{
         if(this.isFull()){
             throw new Exception();
         }

         ParkingTicket ticket = new ParkingTicket();
         vehicle.assignTicket(ticket);
         // increment spot count
         //add to active tickets
         return ticket;
     }


}
