package ru.job4j.oop.profession;

public class Builder extends Engineer{
    private String project;

    public Builder(String name, String surname, String education,
                   String birthday, int experience, String project) {
        super(name, surname, education, birthday, experience);
        this.project = project;
    }

    private Order build(House house){
        return new Order(house);
    }
}
