package com.bosscoder.lld.lsp.used;

import com.bosscoder.lld.without.lsp.DummyDog;

public class DogHandlerV2 {

    public static void main(String[] args) {

        IRealDog dog = new RealDogV2();
        dog.eat();
        dog.makeNoise();

        IToyDog dummy = new DummyDogV2();
        dummy.makeNoise();
    }
}
