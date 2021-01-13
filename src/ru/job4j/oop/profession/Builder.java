package ru.job4j.oop.profession;

public class Builder extends Engineer{
    private String project;

    private Older build(House house){
        return new Older(house);
    }
}
