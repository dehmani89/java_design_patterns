package com.dehmani.patterns.builder;

import com.dehmani.patterns.builder.interfaces.Item;
import com.dehmani.patterns.builder.interfaces.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
