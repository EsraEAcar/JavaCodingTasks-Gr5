package week06.task3;

import java.util.Arrays;

public class String_SumOfAllDigits_Esra {

    public static void main(String[] args) {
        String sentence = "12 java 5   apple 3";

        int sumDigits = sumOfDigitsInSentence(sentence);

        System.out.println("Sum of digits in the sentence '" + sentence + "' is: " + sumDigits);


    }

    /**
     * sum of the digits in a String
     * @param sentence
     * @return
     */
    public static int sumOfDigitsInSentence(String sentence) {
        int sumDigits = 0;

        String[] stringArray = sentence.split("\\s+");
        for (String eachWord : stringArray) {

            if (Character.isDigit(eachWord.charAt(0))) {

                sumDigits += Integer.parseInt(eachWord);
            }
        }

        return sumDigits;
    }

}


/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */
