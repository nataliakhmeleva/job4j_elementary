package ru.job4j.oop.profession;

public class Programmer extends Engineer{
    private String computer;

    public Application support(){
        return new Application();
    }
}
