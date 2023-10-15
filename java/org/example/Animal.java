package org.example;

abstract class Animal {
    private String name;
    private Food food;

    // Inner Class para fazer o bixinho dormir zzZZzz....
    protected class Sleep{
        public int hoursOfSleep;

        public Sleep(int hoursOfSleep) {
            this.hoursOfSleep = hoursOfSleep;
        }

        public void sleep(){
            System.out.println(name + " slept for "+ hoursOfSleep + " hours");
        }
    }

    public Animal(String name, Food food) {
        this.name = name;
        this.food = food;
    }

    public abstract void feed();


    public void callSleeper(int hoursOfSleep){
        Sleep caller = new Sleep(hoursOfSleep);
        caller.sleep();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
