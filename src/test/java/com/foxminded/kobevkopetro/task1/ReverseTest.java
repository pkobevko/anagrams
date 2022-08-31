package com.foxminded.kobevkopetro.task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {
    
    @Test
    public void testReverse() {
        assertEquals("d1cba hgf!e", Reverse.reverse("a1bcd efg!h"));
    }
}
