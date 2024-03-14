package week06.task3;


import java.util.Arrays;

public class SumOfAllDigits_Mahmut {

    public static void main(String[] args) {

        System.out.println(sumOfDigits("12 java 5 apple 3")); // 20

    }

    /**
     * This method returns the sum of the digits in a String
     * @param str (String)
     * @return int  (sum of the digits in a String)
     */

    public static int sumOfDigits(String str){

        int sum = 0;

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr)); // [12, java, 5, apple, 3]

        for (String each : arr) {

            if (Character.isDigit(each.charAt(0))){

                sum += Integer.parseInt(each);
            }
        }
        return sum;
    }
}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */