package org.example;

public class Horse extends Animal{
    public Horse(String name) {
        super(name, Food.HAY);
    }

    @Override
    public void feed() {
        addFood();
    }

    private void addFood() {
        System.out.println("gave 5000g of " + getFood() + " to " + getName());
    }
}
