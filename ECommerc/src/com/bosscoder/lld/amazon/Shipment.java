package com.bosscoder.lld.amazon;

import java.util.Date;
import java.util.List;

public class Shipment implements NotificationType{

     String shipmentId;
     Date creationDate;
     Date estimatedArrivalDate;

     String shipmentMethod;

     List<ShipmentHistory> shipmentHistoryList;

     public void addShipmentStep(ShipmentHistory shipmentHistory){
         //shipmentHistoryList.add(shipmentHistory);
     }


    public List<ShipmentHistory> getShipmentHistoryList() {
        return shipmentHistoryList;
    }
}

class ShipmentHistory{
  String shipmentNumber;
  ShipmentStatus status;
  Date creationDate;
}