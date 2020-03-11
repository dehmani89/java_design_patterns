package com.dehmani.patterns.abstractfactory;

import com.dehmani.patterns.abstractfactory.interfaces.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}