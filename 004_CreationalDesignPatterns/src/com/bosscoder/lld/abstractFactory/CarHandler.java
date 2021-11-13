package com.bosscoder.lld.abstractFactory;

public class CarHandler {

    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.OLD, FuelType.PETROL));
        System.out.println(CarFactory.buildCar(CarType.NEW, FuelType.DIESEL));
    }
}















