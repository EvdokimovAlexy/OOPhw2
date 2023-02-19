package org.example;

public abstract class Herbivores extends Animal{
    public Herbivores(String nickname) {
        super(nickname);
    }

    public String feed(){
        return "herb";
    }
}