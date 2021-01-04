package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
//        int euro = Converter.rubleToEuro(140);
//        System.out.println("140 rubles are " + euro + " euro.");
//        int dollar = Converter.rubleToDollar(3000);
//        System.out.println("3000 rubles are " + dollar + " dollar.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int inDollar = 3000;
        int expectedDollar = 50;
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("3000 rubles are 5. Test result : " + passedDollar);
    }
}
