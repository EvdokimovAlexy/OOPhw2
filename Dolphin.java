package org.example;

public class Dolphin extends marineMammals implements Swimable {
    public Dolphin(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm dolphin. " + super.toString() + ". My speed is " + speedOfswim();
    }
    public String say() {
        return "wiuwiu{я самый лучший}";
    }

    @Override
    public int speedOfswim() {
        return 55;
    }
}
