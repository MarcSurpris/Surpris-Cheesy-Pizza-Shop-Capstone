package com.pluralsight.capstone.model;

import com.pluralsight.capstone.util.ToppingCategory;

// Sauce
public class Sauce extends Topping {
    public Sauce(String name) {
        super(name, ToppingCategory.SAUCE);
    }
}
