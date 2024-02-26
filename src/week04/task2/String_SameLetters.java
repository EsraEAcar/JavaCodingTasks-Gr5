package week04.task2;

import java.util.Arrays;

public class String_SameLetters {
    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cab"));

        System.out.println(sameLetters("out", "otu"));

        System.out.println(sameLetters("abc", "abb"));


    }


    public static boolean sameLetters(String str1, String str2) {

        // Converting input string to character array
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {

            return true;

        } else {

            return false;
        }

    }
}



/*
2️⃣  String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */
