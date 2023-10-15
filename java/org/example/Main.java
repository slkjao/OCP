package org.example;


public class Main {
    public static void main(String[] args) {
        Animal a1 = new Lion("Leono");
        a1.callSleeper(8);
        a1 = new Horse("Pe de Pano");
        a1.feed();
        a1.callSleeper(10);
    }
}