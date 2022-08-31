package com.foxminded.kobevkopetro.task1;

public class Reverse {
    
    public static void main(String[] args) {
        
        System.out.println(reverse("a1bcd efg!h"));
    }

    public static String reverse(String input) {
        
        String inputWords[] = input.split(" ");
        String outputWords[] = new String[inputWords.length];
        int k = 0;
        
        for (String inputWord : inputWords) {
            int j = 0;
            
            String reversedOnlyLetterWord = new StringBuilder(inputWord).reverse().toString().replaceAll("[^a-zA-Z]", "");
            String reversedWord = "";
            
            for (int i = 0; i < reversedOnlyLetterWord.length(); i++) {
                if (Character.isLetter(inputWord.charAt(j))) {
                    reversedWord += reversedOnlyLetterWord.charAt(i);
                    j++;
                } else {
                    reversedWord += inputWord.charAt(j);
                    reversedWord += reversedOnlyLetterWord.charAt(i);
                    j++;
                }
            }
            outputWords[k] = reversedWord;
            k++;
        }
        
        return String.join(" ", outputWords);
    }
}
