package com.bosscoder.lld.structural.decorator;

import com.bosscoder.lld.structural.adapter.Circle;
import com.bosscoder.lld.structural.adapter.Shape;
import com.bosscoder.lld.structural.adapter.Square;

public class DecoratedShapeHandler {

    public static void main(String[] args) {
        System.out.println("Creating shapes without any extra features...");
        Shape square = new Square();
        Shape circle = new Circle();

        System.out.println("Drawing Simple Shape Objects...");
        square.draw();
        circle.draw();

        System.out.println("Creating decorated shapes ...");
        Shape circle1 = new ColorDecorator(circle, Color.YELLOW);
        circle1.draw();
        Shape square1 = new ColorDecorator(square, Color.RED);
        square1.draw();
    }
}
