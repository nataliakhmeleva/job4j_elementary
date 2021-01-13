package ru.job4j.oop.profession;

public class Doctor extends Profession {
    private String category;

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis(pacient);
    }
}
