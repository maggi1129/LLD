package com.company.lld.oops;

public class Duck extends Animal implements FlyingAnimal
{
    @Override
    public void makeSound() {
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}
