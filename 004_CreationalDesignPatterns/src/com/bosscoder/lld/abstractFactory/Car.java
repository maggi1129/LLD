package com.bosscoder.lld.abstractFactory;

public abstract class Car
{

    CarType model = null;
    FuelType fuelType = null;

    Car(CarType model, FuelType type)
    {
        this.model = model;
        this.fuelType = type;
    }

    abstract void construct();

    CarType getModel()
    {
        return model;
    }

    void setModel(CarType model)
    {
        this.model = model;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString()
    {
        return "CarModel - "+model + " with fuel type in "+fuelType;
    }
}