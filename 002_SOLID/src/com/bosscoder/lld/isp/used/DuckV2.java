package com.bosscoder.lld.isp.used;

import com.bosscoder.lld.without.isp.Animal;

public class DuckV2 implements FlyingAnimal,SwimmingAnimal {

    @Override
    public void fly() {
        System.out.println("Duck flies a bit");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}
