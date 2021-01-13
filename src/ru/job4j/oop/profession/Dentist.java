package ru.job4j.oop.profession;

public class Dentist extends Doctor {
    private String dentalTool;

    public Dentist(String name, String surname, String education,
                   String birthday, String category,String dentalTool) {
        super(name, surname, education, birthday, category);
        this.dentalTool = dentalTool;
    }

    public String therapy(String tooth) {
        return tooth;
    }
}
