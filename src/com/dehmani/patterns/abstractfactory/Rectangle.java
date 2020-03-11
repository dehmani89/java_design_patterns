package com.dehmani.patterns.abstractfactory;

import com.dehmani.patterns.abstractfactory.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}