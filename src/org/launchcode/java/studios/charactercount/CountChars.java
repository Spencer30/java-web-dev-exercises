package org.launchcode.java.studios.charactercount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
       System.out.println("Enter a sentence: ");
        String inputSentence = input.nextLine();
       String sentence = inputSentence.toLowerCase();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        char[] sentenceArr = sentence.toCharArray();
        for (char c : sentenceArr) {
            if (letterCount.containsKey(c)) {
                letterCount.put(c, letterCount.get(c) + 1);
            } else {
                letterCount.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> letter : letterCount.entrySet()) {
            System.out.println(letter.getKey() + " " + letter.getValue());
        }
        input.close();
    }
}
