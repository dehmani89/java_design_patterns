package com.dehmani.patterns.factory;

import com.dehmani.patterns.factory.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
