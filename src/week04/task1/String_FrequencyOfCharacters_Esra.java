package week04.task1;

public class String_FrequencyOfCharacters_Esra {

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCDD"));

        System.out.println(frequencyOfCharacters("ssssSSS"));


    }

    public static String frequencyOfCharacters(String str) {

        str = str.toUpperCase();

        String result = "";   //    A3B2C1D2  // S7



        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);   //A
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch) {
                    counter++;
                }
            }

            if (result.contains(ch + "")) {
                continue;  // skip the character that is already contained
            }

            result += ch + "" + counter;
        }

        return result;
    }


}



/*
1️⃣  String - Frequency of Characters`
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */