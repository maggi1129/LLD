package com.bosscoder.lld.structural.adapter;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Circle");
    }
}
