package com.bosscoder.lld.abstractFactory;

class CarFactory
{
    private CarFactory()
    {

    }

    public static Car buildCar(CarType type, FuelType fuelType)
    {
        Car car = null;

        switch(fuelType)
        {
            case DIESEL:
                car = DieselCarFactory.buildCar(type);
                break;

            default:
                car = DefaultCarFactory.buildCar(type);
                break;

        }

        return car;

    }
}

enum CarType
{
    OLD, NEW
}

enum FuelType
{
    DIESEL, PETROL
}
