package com.bosscoder.lld.without.lsp;

public class RealDog implements IDog{
    @Override
    public void eat() {
        System.out.println("Eating pedigree");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bow Bow");
    }
}
