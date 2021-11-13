package com.bosscode.lld.structural.facade;

public class FPHBookingFacade {

    private HotelBookingService hotelBookingService;
    private FlightBookingService flightBookingService;

    public FPHBookingFacade() {
        this.hotelBookingService = new HotelBookingService();
        this.flightBookingService = new FlightBookingService();
    }

    public void createBooking(){
        System.out.println("Creating a booking...");
        hotelBookingService.bookHotel();
        flightBookingService.bookFlight();
        System.out.println("Yay! ready to travel!");
    }
}

