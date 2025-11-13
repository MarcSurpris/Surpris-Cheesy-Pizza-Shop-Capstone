package com.pluralsight.capstone.model;
// GarlicKnot
public class GarlicKnot implements Item {
    private int quantity;
    private static final double PRICE_PER = 1.50;

    public GarlicKnot(int quantity) {
        this.quantity = quantity;
    }
}
