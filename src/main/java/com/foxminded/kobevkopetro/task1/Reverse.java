package com.foxminded.kobevkopetro.task1;

public class Reverse {
    
    public Reverse() {
        
    }
    
    public String reverse(String input) {
        
        String inputWords[] = input.split(" ");
        String outputWords[] = new String[inputWords.length];
        String pattern = "[^a-zA-Z]";
        int k = 0;
        
        
        for (String inputWord : inputWords) {
            int j = 0;
            
            String reversedOnlyLetterWord = new StringBuilder(inputWord).reverse().toString().replaceAll(pattern, "");
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
