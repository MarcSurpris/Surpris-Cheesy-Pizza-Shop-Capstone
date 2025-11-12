package com.pluralsight.capstone.model;

import com.pluralsight.capstone.util.ToppingCategory;

// Cheese Topping
public class Cheese extends Topping {
    public Cheese(String name) {
        super(name, ToppingCategory.CHEESE);
    }
}
