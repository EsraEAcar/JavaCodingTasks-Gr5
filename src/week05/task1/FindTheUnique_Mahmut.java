package week05.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique_Mahmut {

    public static void main(String[] args) {

        System.out.println(uniqueChar1("AAABBBCCCDEF"));// DEF
        System.out.println(uniqueChar2("AAABBBCCCDEF"));// DEF
        System.out.println(uniqueChar3("AAABBBCCCDEF"));// DEF

    }

    /**
     *
     * @param str
     * @return  unique Chars
     */
    public static String uniqueChar1(String str){

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        list.removeIf(p -> Collections.frequency(list,p)>1);

        String result = "";

        for (String each : list) {
            result +=each;
        }
        return result;
    }


    public static String uniqueChar2(String str){

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        String result = "";

        for (String each : list) {

            if (Collections.frequency(list,each) ==1){

                result +=each;
            }

        }
        return result;
    }

    public static String uniqueChar3(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            String new_str = str.substring(0,i) + str.substring(i+1); // remove the currentChar from the given string

            if (!new_str.contains("" + currentChar)){ // If there is no similar char exists in the new_str

                result +="" + currentChar;
            }

        }
        return result;
    }
}
/*
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */