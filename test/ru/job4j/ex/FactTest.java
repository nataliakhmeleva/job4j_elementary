package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenFactMinus5EqualException() {
        new Fact().calc(-5);
    }

    @Test
    public void whenFact5Equal120() {
        assertThat(new Fact().calc(5), is(120));
    }
}