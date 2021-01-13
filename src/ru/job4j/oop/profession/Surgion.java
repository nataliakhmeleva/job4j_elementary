package ru.job4j.oop.profession;

public class Surgion extends Doctor {
    private String surgicalTool;

    public Surgion(String name, String surname, String education,
                   String birthday, String category, String surgicalTool) {
        super(name, surname, education, birthday, category);
        this.surgicalTool = surgicalTool;
    }

    public String surgery(String tool) {
        return tool;
    }
}
