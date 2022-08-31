package com.foxminded.kobevkopetro.task1;

public class Reverse {
    
    public static void main(String[] args) {
        
        System.out.println(reverse("Hello World!"));
    }

    public static String reverse(String input) {
        
        String inputWords[] = input.split(" ");
        String outputWords[] = new String[inputWords.length];
        int i = 0;
        
        for (String inputWord : inputWords) {
            String reverse = new StringBuilder(inputWord).reverse().toString();
            outputWords[i] = reverse;
            i++;
        }
        
        return String.join(" ", outputWords);
    }
}
