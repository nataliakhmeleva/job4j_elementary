package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To3Then5() {
        assertThat(Max.max(5, 3), is(5));
    }

    @Test
    public void whenMax4To4Then4() {
        assertThat(Max.max(4, 4), is(4));
    }
}