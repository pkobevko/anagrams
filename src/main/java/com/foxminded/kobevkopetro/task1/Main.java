package com.foxminded.kobevkopetro.task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {
			System.out.print("Enter your text: ");
			String input = scanner.nextLine();

			System.out.print("Result: " + new Reverse().reversePhrase(input));
		}
	}
}
