package week05.task2;

import java.util.Arrays;

public class Reverse_Abeer {

    public static void main(String[] args) {


        System.out.println(Reverse("ABCD"));

    }

    public static String Reverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }
}
