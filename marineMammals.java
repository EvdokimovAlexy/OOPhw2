package org.example;

public abstract class marineMammals extends Animal  {
    public marineMammals(String nickname) {
        super(nickname);
    }

    @Override
    public String feed() {
        return "fish";
    }

}
