package week04.task2;

import java.util.Arrays;

public class Same_Letters_Abeer {

    public static void main(String[] args) {

        System.out.println("Is the two words contain the same letter: "+same("abc","cab"));
        System.out.println("Is the two words contain the same letter: "+same("abc","abbc"));

    }

    public static boolean same(String str1,String str2)
    {
        char [] char_array1=str1.toCharArray();
        char [] char_array2=str2.toCharArray();
        Arrays.sort(char_array1);
        Arrays.sort(char_array2);


        return Arrays.equals(char_array1,char_array2);

    }

}

