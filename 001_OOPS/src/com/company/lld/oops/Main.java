package com.company.lld.oops;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // Let's see the use of encapsulation
//        Person person = new Person();
//        person.name = "Megha Arora";
//        person.role = "Developer";
//        person.age = -100;
//
//        EncapsulatedPerson encapsulatedPerson = new EncapsulatedPerson();
//        //encapsulatedPerson.age = -1; // ---> Compiler error
//
//        //encapsulatedPerson.setAge(-1);
//        encapsulatedPerson.setAge(30);

//        //Let's see polymorphism
//
//        Animal a = new Cat();
//        //a.fly();
//        a.sleep();
//        a.makeSound();
//
//        Animal b = new Dog();
//        b.sleep();
//        b.makeSound();
//
//        Animal c = new Duck();
//        c.makeSound();
//        c.sleep();
//
//        List<Animal> animalList = new ArrayList<>();
//        animalList.add(a);
//        animalList.add(b);
//        animalList.add(c);
//
//        System.out.println("Magic of Polymorphism");
//        for(Animal animal : animalList){
//            animal.makeSound();
//        }

        //Overloading in action
        System.out.println("Running 1st version");
        overloadingExample(1);
        System.out.println("Running 2nd version");
        System.out.println(overloadingExample(1,6));
    }

    private static void overloadingExample(int a){

    }
    private static int overloadingExample(int a, int b ){
      return a+b;
    }
}
