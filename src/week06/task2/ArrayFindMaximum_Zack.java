package week06.task2;

import java.util.Arrays;

public class ArrayFindMaximum_Zack {
    /*
    === Array_FindMaximum =============
        Write a method that can find the maximum number from an int Array
            Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
    public static void main(String[] args) {
        int[] nums = {99, 12, 23, 32, 44,123, 57, 6};
        System.out.println("maxValue_1(nums) = " + maxValue_1(nums));
        System.out.println("maxValue_2(nums) = " + maxValue_2(nums));


    }

// ============= SOLUTION 1 =============================
    /**
     * returns the maximum number from the given int Array
     * @param numArr int array
     * @return int
     */
    public static int maxValue_1( int[] numArr ) {
        int max = Integer.MIN_VALUE;
        for(int each: numArr)
            if(each > max)
                max = each;
        return max;
    }


// ============= SOLUTION 2 - with using sort() =============================
    /**
     * returns the maximum number from the given int Array
     * @param numArr int array
     * @return int
     */
    public static int maxValue_2( int[] numArr ) {
        Arrays.sort( numArr );
        return numArr[numArr.length-1];

    }
}