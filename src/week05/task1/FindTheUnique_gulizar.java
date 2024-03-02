package week05.task1;

public class FindTheUnique_gulizar {
    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }


    public static String unique(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char uniqChar = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (uniqChar == str.charAt(j)){
                    count++;
                }

            }
            if ( count ==1){
                result += uniqChar;
            }

        }
        return result;
    }
}
/*
String - Find the unique
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */