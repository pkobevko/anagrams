package com.foxminded.kobevkopetro.task1;

import java.util.Scanner;

public class ReverseTestDrive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your text: ");
        String input = scanner.nextLine();
        scanner.close();
        
        Reverse reverseInstance = new Reverse();
        System.out.print("Result: " + reverseInstance.reverse(input));
    }
}
