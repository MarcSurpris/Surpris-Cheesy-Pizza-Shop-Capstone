package com.pluralsight.capstone.model;

import com.pluralsight.capstone.util.ToppingCategory;

// Side
public class Side extends Topping {
    public Side(String name) {
        super(name, ToppingCategory.SIDE);
    }
}
