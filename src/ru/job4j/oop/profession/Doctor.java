package ru.job4j.oop.profession;

public class Doctor extends Profession {
    private String category;

    public Doctor(String name, String surname, String education, String birthday, String category) {
        super(name, surname, education, birthday);
        this.category = category;
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis(pacient);
    }
}
