package com.bosscoder.lld.structural.decorator;


import com.bosscoder.lld.structural.adapter.Shape;

public  abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        super();
        this.decoratedShape = decoratedShape;
    }

}