package week07.task3;

import java.util.Arrays;

public class Array_SortDescending_Mahmut {

    public static void main(String[] args) {

        int[] arr = {10,20,7, 8, 90};
        sortDescending1(arr); // [90, 20, 10, 8, 7]
        sortDescending2(arr); // [90, 20, 10, 8, 7]

    }
    public static void sortDescending1(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++)

                if (arr[i] < arr[j]) {

                    int temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }
            //System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void sortDescending2(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++)

                if (arr[i] < arr[j]) {

                    arr[i]= arr[i] + arr[j];

                    arr[j] = arr[i] - arr[j];

                    arr[i] = arr[i] - arr[j];
                }
            //System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));

    }

}

/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
 */
