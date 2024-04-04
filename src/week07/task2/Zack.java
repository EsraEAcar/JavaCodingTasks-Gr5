package week07.task2;

import java.util.Arrays;

public class Zack {
    /*
    ======= Array_SortAscending ==============
        Write a return method that can sort an int array in Ascending order without using the sort method Arrays class
                Ex: int[] arr = {10, 9, 8, 7};
                    arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
     */
    public static void main(String[] args) {
        int[] numArr = {10, 9, 8, 7,0 ,2,4,11,55};

        System.out.println("Arrays.toString(sortingArrayAsc(numArr)) = " + Arrays.toString(sortingArrayAsc(numArr)));

    }

    /**
     * sort an int array in Ascending order without using the sort method of Arrays class
     * @param arr int arr
     * @return int arr
     */
    public static int[] sortingArrayAsc(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <  arr.length; j++) {
                if (arr[i] < arr[j] ) {
                    Integer temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
}
