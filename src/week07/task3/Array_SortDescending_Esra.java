package week07.task3;

import java.util.Arrays;

public class Array_SortDescending_Esra {

    public static void main(String[] args) {

        int[] arr = {10,20,7, 8, 90};
        sortDesc(arr);


    }

    /**
     * Sorting an array
     * @param arr
     */
    public static void sortDesc(int[] arr){

        Arrays.sort(arr);
        System.out.print("Elements of array sorted in ascending order: \n");
        for (int i = arr.length-1; i >= 0; i--)
        {
            System.out.print(arr[i]+ ", ");

        }


    }


}

/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
 */