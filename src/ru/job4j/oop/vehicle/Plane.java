package ru.job4j.oop.vehicle;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("самолет летает по воздуху");
    }
}
