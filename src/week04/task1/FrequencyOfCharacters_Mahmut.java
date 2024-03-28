package week04.task1;

import java.util.*;

public class FrequencyOfCharacters_Mahmut {

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters1("AAABBCDD")); // A3B2C1D2
        System.out.println(frequencyOfCharacters2("AAABBCDD")); // A3B2C1D2
        System.out.println(frequencyOfCharacters3("AAABBCDD")); // A3B2C1D2

    }


    public static String frequencyOfCharacters1(String str){

        String[] strArray = str.split("");
        ArrayList<String> strArrayList = new ArrayList<>(Arrays.asList(strArray));

        String result = "";

        for (String each : strArrayList) {

            if (!result.contains(each)){
                result += each + Collections.frequency(strArrayList,each);
            }
        }
        return result;
    }



    public static String frequencyOfCharacters2 (String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count =0;

            char currentChar = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                if (currentChar==str.charAt(j)){
                    count++;
                }
            }
            if (!result.contains("" +currentChar)){
                result += "" + currentChar + count;
            }
        }
        return result;
    }



    public static String frequencyOfCharacters3(String str){

        String result = "";

        // Key is each  "string type" character ,  Value is frequency
        Map<String, Integer> map = new LinkedHashMap<>();

        String[] strArray = str.split("");

        ArrayList<String> charList = new ArrayList<>(Arrays.asList(strArray));

        for (String each : strArray) {
            int frequency = Collections.frequency(charList, each);
            map.put(each, frequency);
        }

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            result +=eachEntry.getKey() + eachEntry.getValue();
        }

        return result;
    }
}
/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */