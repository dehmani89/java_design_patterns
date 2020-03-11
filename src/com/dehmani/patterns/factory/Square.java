package com.dehmani.patterns.factory;

import com.dehmani.patterns.factory.interfaces.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}