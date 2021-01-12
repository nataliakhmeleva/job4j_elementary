package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class PointTest {

    @Test
    public void whenDistanceTo2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist1 = a.distance(b);
        assertThat(dist1, is(2.0));
    }

    @Test
    public void when3dTo5() {
        Point a = new Point(0, 0, 4);
        Point b = new Point(0, 4, 1);
        double dist1 = a.distance3d(b);
        assertThat(dist1, is(5.0));
    }
}