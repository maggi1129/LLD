package com.bosscoder.lld.abstractFactory;

public class OldCar extends Car {
    OldCar(FuelType fuelType)
    {
        super(CarType.OLD, fuelType);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("Connecting to old car");
    }
}

