package com.foxminded.kobevkopetro.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseTest {

    @Test
    void testTest() {
        Assertions.assertTrue(true);
    }

    @Test
    void nullShouldReturnIllegalArgumentException() {
        Reverse reverse = new Reverse();
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> {
                reverse.reversePhrase(null);
            });
    }
}
