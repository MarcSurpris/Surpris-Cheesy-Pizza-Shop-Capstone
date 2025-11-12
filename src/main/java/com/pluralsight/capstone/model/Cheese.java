package com.pluralsight.capstone.model;

import com.pluralsight.capstone.util.PizzaSize;
import com.pluralsight.capstone.util.ToppingCategory;

// Cheese Topping
public class Cheese extends Topping {
    public Cheese(String name) {
        super(name, ToppingCategory.CHEESE);
    }

    @Override
    public double getBasePrice(String size) {
        return PizzaSize.getCheesePrice(size);
    }

    @Override
    public double getExtraPrice(String size) {
        return PizzaSize.getExtraCheesePrice(size);
    }
}
