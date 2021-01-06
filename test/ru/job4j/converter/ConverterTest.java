package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int inDollar = 3000;
        int expectedDollar = 50;
        int outDollar = Converter.rubleToDollar(inDollar);
        Assert.assertEquals(expectedDollar, outDollar);
    }
}