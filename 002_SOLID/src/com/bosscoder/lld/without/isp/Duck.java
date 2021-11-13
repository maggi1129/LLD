package com.bosscoder.lld.without.isp;

public class Duck implements Animal{
    @Override
    public void run() {
        throw new RuntimeException("Not Applicable for Duck");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }

    @Override
    public void climb() {
        throw new RuntimeException("Not Applicable for Duck");
    }

    @Override
    public void fly() {
        System.out.println("Duck flies a bit");
    }
}
