package com.dehmani.patterns.builder;

import com.dehmani.patterns.builder.interfaces.Item;
import com.dehmani.patterns.builder.interfaces.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
