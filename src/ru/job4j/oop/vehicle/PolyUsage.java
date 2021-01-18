package ru.job4j.oop.vehicle;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle boeing = new Plane();
        Vehicle airbus = new Plane();
        Vehicle sapsan = new Train();
        Vehicle lastochka = new Train();
        Vehicle electrobus = new Bus();
        Vehicle smallbus = new Bus();

        Vehicle[] vehicles = {boeing, airbus, sapsan, lastochka, electrobus, smallbus};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
