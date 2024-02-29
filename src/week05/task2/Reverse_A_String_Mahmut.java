package week05.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse_A_String_Mahmut {

    public static void main(String[] args) {

        System.out.println(reverse1("ABCD")); // DCBA
        System.out.println(reverse2("ABCD")); // DCBA

    }

    /**
     *
     * @param str
     * @return reversed_str
     */


    public static String reverse1(String str){

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        Collections.reverse(list);

        String result = "";

        for (String each : list) {
            result +=each;
        }

        return result;
    }

    public static String reverse2(String str){

        String result = "";

        for (int i = str.length() - 1; i >=0; i--) {

            result += str.charAt(i);

        }

        return result;
    }

}
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */