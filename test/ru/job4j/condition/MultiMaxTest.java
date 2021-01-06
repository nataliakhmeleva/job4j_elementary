package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        assertThat(MultiMax.max(5, 3, 4), is(5));
    }

    @Test
    public void whenThirdMax() {
        assertThat(MultiMax.max(6, 2, 7), is(7));
    }

    @Test
    public void whenEqualMax() {
        assertThat(MultiMax.max(2, 2, 2), is(2));
    }
}