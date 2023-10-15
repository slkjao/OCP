package org.example;

public enum Food {
    GRASS("Cow"), MEAT("Lion"), HAY("Horse"), SEED("Bird");
    private String destinedAnimal;
    private Food(String destinedAnimal){
        this.destinedAnimal = destinedAnimal;
    }

    public void printDestinedAnimal(){
        System.out.println(destinedAnimal);
    }
}
