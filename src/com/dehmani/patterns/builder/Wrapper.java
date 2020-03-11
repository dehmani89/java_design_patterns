package com.dehmani.patterns.builder;

import com.dehmani.patterns.builder.interfaces.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}