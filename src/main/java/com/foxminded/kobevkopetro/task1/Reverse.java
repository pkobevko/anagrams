package com.foxminded.kobevkopetro.task1;

import java.util.StringJoiner;

public class Reverse {
    
    private static final String REGEX_ONLY_LETTERS = "[^a-zA-Z]";

    public Reverse() {

    }

    public String reversePhrase(String input) {
        String wordsArray[] = input.split(" ");
        StringJoiner result = new StringJoiner(" ");

        for (String word : wordsArray) {
            result.add(reverseWord(word));
        }
        
        return result.toString();
    }

    public static String reverseWord(String word) {
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
