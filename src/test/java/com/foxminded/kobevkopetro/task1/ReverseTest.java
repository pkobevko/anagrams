package com.foxminded.kobevkopetro.task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

    @Test
    public void testMain() {
        assertEquals("olleH !dlroW", Reverse.reverse("Hello World!"));
    }

}
