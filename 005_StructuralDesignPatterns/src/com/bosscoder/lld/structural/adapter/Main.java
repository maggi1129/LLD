package com.bosscoder.lld.structural.adapter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Creating drawing of shapes...");
        DrawService drawing = new DrawService();
        drawing.addShape(new Square());
        drawing.addShape(new Circle());

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
    }
}
