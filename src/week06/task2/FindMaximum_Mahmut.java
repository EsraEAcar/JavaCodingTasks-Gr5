package week06.task2;

public class FindMaximum_Mahmut {

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println(maximumNumber(arr)); // 99
    }


    /**
     * This method finds maximum number from the given int array
     * @param arr (int array)
     * @return  maximum number from the given array
     */
    public static int maximumNumber(int[] arr){

        // int max = arr[0];    this also ok
        int max = Integer.MIN_VALUE;

        for (int each : arr) {

            if (each > max){

                max = each;
            }
        }
        return max;
    }

}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */