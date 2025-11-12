package com.pluralsight.capstone.model;

// Meat Topping

import com.pluralsight.capstone.util.ToppingCategory;

public class Meat extends Topping {
    public Meat(String name) {
        super(name, ToppingCategory.Meat);
    }
}
