package com.bosscoder.lld.without.isp;

public class Fish implements Animal{
    @Override
    public void run() {
        throw new RuntimeException("Not applicable");
    }

    @Override
    public void swim() {
        System.out.println("Fish swims");
    }

    @Override
    public void climb() {
        throw new RuntimeException("Not applicable for fish");
    }

    @Override
    public void fly() {
        throw new RuntimeException("Not applicable for fish");
    }
}
