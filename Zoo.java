package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final Radio radio = new Radio();
    private final List<Animal> animals = new ArrayList<>();

    public void addAnimals(List<Animal> animals) {
        this.animals.addAll(animals);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Sayable> getSayAble() {
        List<Sayable> result = new ArrayList<>();
        for (Animal item : animals) {
            result.add(item);
        }
        result.add(radio);
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable) {
                result.add((Runable) item);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable) {
                result.add((Flyable) item);
            }
        }
        return result;
    }

    public Runable getWinner() {
        List<Runable> runanimals = getRunable();
        Runable winner = runanimals.get(0);
        for (Runable item : runanimals) {
            if (winner.speedOfRun() < item.speedOfRun()) {
                winner = item;
            }
        }
        return winner;
    }

    public Flyable getWinnerFly() {
        List<Flyable> flyanimals = getFlyable();
        Flyable winner = flyanimals.get(0);
        for (Flyable item : flyanimals) {
            if (winner.speedOfFly() < item.speedOfFly()) {
                winner = item;
            }
        }
        return winner;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof marineMammals) {
                result.add((Swimable) item);
            }
        }
        return result;
    }
}