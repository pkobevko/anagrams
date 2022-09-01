package com.foxminded.kobevkopetro.task1;

import java.util.StringJoiner;

public class Reverse {

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
        String pattern = "[^a-zA-Z]";
        
        String reversedOnlyLetterWord = new StringBuilder(word).reverse().toString().replaceAll(pattern, "");
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
