package ru.job4j.oop.vehicle;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("автобус двигается по скоростным трассам");
    }
}
