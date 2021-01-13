package ru.job4j.oop.profession;

public class Programmer extends Engineer {
    private String computer;

    public Programmer(String name, String surname, String education,
                      String birthday, int experience, String computer) {
        super(name, surname, education, birthday, experience);
        this.computer = computer;
    }

    public Application support() {
        return new Application(computer);
    }
}
