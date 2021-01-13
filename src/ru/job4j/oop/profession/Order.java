package ru.job4j.oop.profession;

public class Order {
    private int number;
    private House house;

    public Order(House house, int number) {
        this.house = house;
        this.number = number;
    }

    public Order() {

    }
}
