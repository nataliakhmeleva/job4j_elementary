package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setGroup("PRO-413");
        student.setCreated(new Date());
        System.out.println(student.getName() + " learns " + student.getGroup() + student.getCreated());
    }
}
