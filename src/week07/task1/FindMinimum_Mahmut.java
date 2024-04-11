package week07.task1;

public class FindMinimum_Mahmut {

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6}; // 6

        System.out.println( minimumNumber(arr));

    }

    /**
     * This method finds minimum number from the given int array
     * @param arr (int array)
     * @return  minimum number from the given array
     */

    public static int minimumNumber(int[] arr){

        //int min =  Integer.MAX_VALUE; ==> this also works
        int min = arr[0];

        for (int each : arr) {

            if (each < min){

                min = each;
            }
        }
        return min;
    }

}
/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */
