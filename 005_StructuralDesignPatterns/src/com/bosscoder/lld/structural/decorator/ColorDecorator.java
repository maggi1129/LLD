package com.bosscoder.lld.structural.decorator;

import com.bosscoder.lld.structural.adapter.Shape;

public class ColorDecorator extends ShapeDecorator {

    protected Color color;

    public ColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Fill Color: " + color);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }


}

enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW;
}