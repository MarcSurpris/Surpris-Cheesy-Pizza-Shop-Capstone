package com.pluralsight.capstone.model;

// Abstract Topping

public abstract class Topping {
    private String name;
    private String category;
    private int extraAmount = 0;
    
    public Topping(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public void addExtra(int amount) {
        this.extraAmount += amount;
    }

    public double getPrice(String size) {
        double base = getBasePrice(size);
        double extraPrice = getExtraPrice(size) * extraAmount;
        return base + extraPrice;
    }

    public abstract double getBasePrice(String size);

    public abstract double getExtraPrice(String size);

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getExtraAmount() {
        return extraAmount;
    }

    @Override
    public String toString() {
        String extraStr = extraAmount > 0 ? " (extra x" + extraAmount + ")" : "";
        return name + extraStr;
    }
}
