package com.dehmani.patterns.abstractfactory;

import com.dehmani.patterns.abstractfactory.interfaces.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType) ;
}