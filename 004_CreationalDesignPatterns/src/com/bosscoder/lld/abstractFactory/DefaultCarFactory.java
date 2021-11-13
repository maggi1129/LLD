package com.bosscoder.lld.abstractFactory;

public class DefaultCarFactory {

    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case OLD:
                car = new OldCar(FuelType.PETROL);
                break;

            case NEW:
                car = new NewCar(FuelType.PETROL);
                break;

            default:
                break;

        }
        return car;
    }
}