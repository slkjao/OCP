package org.example;

public class Cow extends Animal{
    public Cow(String name) {
        super(name, Food.GRASS);
    }

    @Override
    public void feed() {
        addFood();
    }

    private void addFood() {
        System.out.println("gave 2500g of " + getFood() + " to " + getName());
    }
}
