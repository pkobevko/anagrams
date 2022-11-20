package com.foxminded.kobevkopetro.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseTest {

    Reverse reverse = new Reverse();

    @Test
    void reversePhrase_shouldThrowIllegalArgumentException_whenPassingNull() {
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> {
                reverse.reversePhrase(null);
            });
    }

    @Test
    void reversePhrase_shouldReturnEmptyString_whenInputStringContainsEmptyString() {
        Assertions.assertEquals("", reverse.reversePhrase(""));
    }

    @Test
    void reversePhrase_shouldReturnSingleSpace_whenInputStringContainsSingleSpace() {
        Assertions.assertEquals(" ", reverse.reversePhrase(" "));
    }

    @Test
    void reversePhrase_shouldReturnSameAmountOfSpaces_whenInputStringContainsOnlySpaces() {
        Assertions.assertEquals("       ", reverse.reversePhrase("       "));
    }

    @Test
    void reversePhrase_shouldReturnThatCharacter_whenInputStringContainsSingleCharacter() {
        Assertions.assertEquals("!", reverse.reversePhrase("!"));
    }

    @Test
    void reversePhrase_shouldReturnStringWithoutChanges_whenInputStringContainsMultipleSameLetter() {
        Assertions.assertEquals("kkkkkkk", reverse.reversePhrase("kkkkkkk"));
    }

    @Test
    void reverePhrase_shouldWorkCorrect_whenInputStringEndsWithNumber() {
        Assertions.assertEquals("tset3", reverse.reversePhrase("test3"));
    }

    @Test
    void reversePhrase_shouldWorkCorrect_whenInputStringContainsStringWithSeveralSymbolsInRow() {
        Assertions.assertEquals("ts333u!!!j g444nit!!!set", reverse.reversePhrase("ju333s!!!t t444est!!!ing"));
    }

    @Test
    void reversePhrase_shouldReturnStringWithoutChanges_whenInputStringContainsOnlySymbols() {
        Assertions.assertEquals("!!!???111222333;;;", reverse.reversePhrase("!!!???111222333;;;"));
    }
}