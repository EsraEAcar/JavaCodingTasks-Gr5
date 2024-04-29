package week07.task1;


public class Array_FindMinimum_Esra {

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        findMinNumber(arr);


    }

    /**
     * Find min number
     * @param arr
     */
    public static void findMinNumber(int[] arr) {

        int min = arr[0];   // Integer.minvalue ZAck sai

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("min number = " + min);
    }

}


/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */
