package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when24to58then5() {
        double expected = 5;
        double out = Point.distance(2, 4, 5, 8);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to11then1() {
        double expected = 1;
        double out = Point.distance(1, 2, 1, 1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to32then3() {
        double expected = 3;
        double out = Point.distance(0, 2, 3, 2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
