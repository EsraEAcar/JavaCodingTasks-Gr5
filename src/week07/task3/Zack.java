package week07.task3;

import java.util.Arrays;

public class Zack {
    /*
    ======= Array_SortDescending ==============
        Write a return method that can sort an int array in descending order without using the sort method Arrays class
                Ex: int[] arr = {10,20,7, 8, 90};
                    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */
    public static void main(String[] args) {
        int[] numArr = {10, 9, 8, 7,0 ,2,4,11,55};

        System.out.println("Arrays.toString(sortingArrayDsc(numArr)) = " + Arrays.toString(sortingArrayDesc(numArr)));

    }

    /**
     * sort an int array in descending order without using the sort method of Arrays class
     * @param arr int arr
     * @return int arr
     */

    public static int[] sortingArrayDesc(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <  arr.length; j++) {
                if (arr[i] > arr[j] ) {
                    Integer temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
}
