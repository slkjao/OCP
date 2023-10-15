package org.example;

public class Lion extends Animal{

    public Lion(String name) {
        super(name, Food.MEAT);
    }
    
    @Override
    public void feed() {
        addFood();
    }

    private void addFood() {
        System.out.println("gave 3800g of " + getFood() + " to " + getName());
    }
}
