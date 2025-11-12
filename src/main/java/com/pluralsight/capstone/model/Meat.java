package com.pluralsight.capstone.model;

// Meat Topping

import com.pluralsight.capstone.util.PizzaSize;
import com.pluralsight.capstone.util.ToppingCategory;

public class Meat extends Topping {
    public Meat(String name) {
        super(name, ToppingCategory.MEAT);
    }

    @Override
    public double getBasePrice(String size) {
        return PizzaSize.getMeatPrice(size);
    }

    @Override
    public double getExtraPrice(String size) {
        return PizzaSize.getExtraMeatPrice(size);
    }
}
