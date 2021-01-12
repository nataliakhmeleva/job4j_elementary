package ru.job4j.condition;

public class Max {
    public static int max(int one, int two) {
        return (one > two) ? one : two;
    }

    public static int max(int one, int two, int three) {
        return (max(one, two) > three) ? max(one, two) : three;
    }

    public static int max(int one, int two, int three, int four) {

        return (max(one, two) > max(three, four)) ? max(one, two) : max(three, four);
    }
}
