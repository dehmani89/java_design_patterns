package com.dehmani.patterns.factory;

import com.dehmani.patterns.factory.interfaces.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
