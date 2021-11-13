package com.bosscoder.lld.without.lsp;

public class DummyDog implements IDog{
    @Override
    public void eat() {
        throw new RuntimeException("Can't eat");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bow Bow");
    }
}
