package com.bosscoder.lld.structural.adapter;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Square");
    }
}
