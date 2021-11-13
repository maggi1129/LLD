package com.company.lld.oops;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bow Wow");
    }

    public void sleep(){
        System.out.println("Dog is sleeping!");
    }
//
//    @Override
//    public void fly() {
//        throw new RuntimeException();
//    }
}
