package week04.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class SameLetters_Mahmut {

    public static void main(String[] args) {

        System.out.println(isSameLetters1("abc", "cba")); // true
        System.out.println(isSameLetters1("abc", "abb"));  // false

    }

    public static boolean isSameLetters1(String str1, String str2) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }

}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false

 */