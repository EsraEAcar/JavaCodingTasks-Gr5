package week05.task1;

import week04.task1.String_FrequencyOfCharacters_Esra;

import java.lang.reflect.Array;
import java.util.HashMap;

public class String_FindUniques_Esra {

    public static void main(String[] args) {

        frequencyOfCharacters("AAABBBCCCDEF");


    }

    public static void frequencyOfCharacters(String str) {

        String strOfUniqueChars = "";

        for(int i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                strOfUniqueChars += ch;
            }
        }

        System.out.println(strOfUniqueChars);



    }
}


/*

1️⃣  String - Find the unique
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";

 */