package com.foxminded.kobevkopetro.task1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse {

	private static final String REGEX_ONLY_LETTERS = "[^a-zA-Z]";
	private static final String SEPARATOR = " ";

	public String reversePhrase(String input) {
		return Stream.of(input.split(SEPARATOR)).map(word -> reverseWord(word)).collect(Collectors.joining(SEPARATOR));
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
