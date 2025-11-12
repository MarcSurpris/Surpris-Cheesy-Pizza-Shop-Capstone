package com.pluralsight.capstone.model;

// Meat Topping

import com.pluralsight.capstone.util.PizzaSize;
import com.pluralsight.capstone.util.ToppingCategory;

public class Meat extends Topping {
    public Meat(String name) {
        super(name, ToppingCategory.Meat);
    }

    @Override
    public double getBasePrice(String size) {
        return PizzaSize.getMeatPrice(size);
    }
}
