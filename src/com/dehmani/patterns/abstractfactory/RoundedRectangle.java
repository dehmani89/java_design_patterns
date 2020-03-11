package com.dehmani.patterns.abstractfactory;

import com.dehmani.patterns.abstractfactory.interfaces.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}