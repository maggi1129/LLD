package com.bosscoder.lld.without.lsp;

/**
 * Liskov Substitution Principle Not followed
 */
public class DogHandler {

    public static void main(String[] args) {
        //Works fine
        IDog pet = new RealDog();
        pet.eat();
        pet.makeNoise();

        // Is a relationship passes but not all functionalities work
        IDog dog = new DummyDog();
        dog.eat();
        dog.makeNoise();

    }
}
