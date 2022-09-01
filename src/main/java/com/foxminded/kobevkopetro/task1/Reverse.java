package com.foxminded.kobevkopetro.task1;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Reverse {
    
    private static final String REGEX_ONLY_LETTERS = "[^a-zA-Z]";

    public Reverse() {

    }

    public String reversePhrase(String input) {
        String wordsArray[] = input.split(" ");
        StringJoiner result = new StringJoiner(" ");
        
        Stream<String> stream = Arrays.stream(wordsArray);
        stream.forEach(str -> result.add(reverseWord(str)));
        
        return result.toString();
    }

    private String reverseWord(String word) {
        String reversedOnlyLetterWord = new StringBuilder(word).reverse().toString().replaceAll(REGEX_ONLY_LETTERS, "");
        String reversedWord = "";

        for (int i = 0; i < reversedOnlyLetterWord.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                reversedWord += reversedOnlyLetterWord.charAt(i);
            } else {
                reversedWord += word.charAt(i);
                reversedWord += reversedOnlyLetterWord.charAt(i);
            }
        }
        
        return reversedWord;
    }
}
