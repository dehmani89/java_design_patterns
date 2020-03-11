package com.dehmani.patterns.abstractfactory;

import com.dehmani.patterns.abstractfactory.interfaces.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
