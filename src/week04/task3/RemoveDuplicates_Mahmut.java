package week04.task3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates_Mahmut {

    public static void main(String[] args) {

        System.out.println(removeDup1("AAABBBCCC")); //ABC
        System.out.println(removeDup2("AAABBBCCC")); //ABC
        System.out.println(removeDup3("AAABBBCCC")); //ABC
    }

    public static String removeDup1(String str){

       Set linkedHashSet = new LinkedHashSet<>(Arrays.asList(str.split("")));

        String result = "";

        for (Object each : linkedHashSet) {
            result += each;
        }

        return result;
    }
    public static String removeDup2(String str){

        String[] strArray = str.split("");
        String result = "";

        for (String each : strArray) {

            if (!result.contains(each)){
                result += each;
            }
        }
        return result;
    }



    public static String removeDup3(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!result.contains( ""+ each)){

                result +=each;

            }
        }

        return result;

    }
}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */