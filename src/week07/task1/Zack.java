package week07.task1;

import java.util.Arrays;

public class Zack {
    /*
    === Array_FindMinimum =============
        Write a method that can find the minimum number from an int Array
            Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
    public static void main(String[] args) {
        int[] nums = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("minValue_1(nums) = " + minValue_1(nums));
        System.out.println("minValue_2(nums) = " + minValue_2(nums));


    }

// ============= SOLUTION 1 =============================
    /**
     * returns the minimum number from the given int Array
     * @param numArr int array
     * @return int
     */
    public static int minValue_1( int[] numArr ) {
        int min = Integer.MAX_VALUE;
        for(int each: numArr)

            if(each < min)
              min = each;

        return min;


    }


// ============= SOLUTION 2 - with using sort() =============================
    /**
     * returns the minimum number from the given int Array
     * @param numArr int array
     * @return int
     */
    public static int minValue_2( int[] numArr ) {
        Arrays.sort( numArr );
        return numArr[0];

    }
}