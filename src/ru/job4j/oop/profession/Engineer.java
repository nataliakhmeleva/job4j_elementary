package ru.job4j.oop.profession;

public class Engineer extends Profession {
    private int experience;

    public Older perform() {
        return new Older();
    }
}
