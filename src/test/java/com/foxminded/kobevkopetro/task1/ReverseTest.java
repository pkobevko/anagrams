package com.foxminded.kobevkopetro.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseTest {

    Reverse reverse = new Reverse();

    @Test
    void reversePhrase_shouldThrowIllegalArgumentException_whenPassingNull() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
            () -> {
                reverse.reversePhrase(null);
            });

        String expectedMessage = "You cannot pass null to this function";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void reversePhrase_shouldReturnEmptyString_whenInputStringContainsEmptyString() {
        String expected = "";
        String actual = reverse.reversePhrase("");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reversePhrase_shouldReturnSingleSpace_whenInputStringContainsSingleSpace() {
        String expected = " ";
        String actual = reverse.reversePhrase(" ");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reversePhrase_shouldReturnSameAmountOfSpaces_whenInputStringContainsOnlySpaces() {
        String expected = "       ";
        String actual = reverse.reversePhrase("       ");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reversePhrase_shouldReturnThatCharacter_whenInputStringContainsSingleCharacter() {
        String expected = "!";
        String actual = reverse.reversePhrase("!");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reversePhrase_shouldReturnStringWithoutChanges_whenInputStringContainsMultipleSameLetter() {
        String expected = "kkkkkkk";
        String actual = reverse.reversePhrase("kkkkkkk");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reverePhrase_shouldWorkCorrect_whenInputStringEndsWithSymbol() {
        String expected = "tset3";
        String actual = reverse.reversePhrase("test3");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reversePhrase_shouldWorkCorrect_whenInputStringContainsStringWithSeveralSymbolsInRow() {
        String expected = "ts333u!!!j g444nit!!!set";
        String actual = reverse.reversePhrase("ju333s!!!t t444est!!!ing");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reversePhrase_shouldReturnStringWithoutChanges_whenInputStringContainsOnlySymbols() {
        String expected = "!!!???111222333;;;";
        String actual = reverse.reversePhrase("!!!???111222333;;;");
        Assertions.assertEquals(expected, actual);
    }
}