package org.example;

public class Bird extends Animal{
    public Bird(String name) {
        super(name, Food.SEED);
    }

    @Override
    public void feed() {
        addFood();
    }

    private void addFood() {
        System.out.println("gave 240g of " + getFood() + " to " + getName());
    }
}
