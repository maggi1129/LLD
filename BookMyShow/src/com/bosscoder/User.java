package com.bosscoder;

import java.util.List;
import java.util.Map;

public abstract class User {

     private String userId;
     private String userName;
     private Address address;

     //getters & setters

     public void doSearch(){

     }

}

//User -->  Driver, Rider

class Guest extends User{
    // search

    public void register(){

    }
}

class Member extends User{

    String prefs;

    public void login(){

    }
    public String getPreferences(){
        return prefs;
    }
    public void doPayment(Payment payment){

    }
    // bookRide
}

class Driver extends User{

    //register


}

 interface RiderService{
    //startRide
    //endRide
    //accept
    //cancel
}
class Location{
    String lat;
    String longitude;
}


 interface DriverPickerService{

    Driver pickDriver(Location location);
}

class DriverPickerServiceImpl implements DriverPickerService{

    Map<Location, List<Driver>> driverList ;

    @Override
    public Driver pickDriver(Location location) {
        return driverList.get(location).get(0);
    }
}

class Rider extends  User{

    DriverPickerService driverPickerService = new DriverPickerServiceImpl();

    Location location;

    public boolean bookRide()
    {
        driverPickerService.pickDriver(this.location);
        // booking functionality
        return true;
    }

    //payment
}

class GuestRider extends Rider{

}

class RegisteredRider extends User{

}
// Why abstract ---> guest/ member/ admin
// Why not an interface ?

// person -> admin, user
//user -> guest , member