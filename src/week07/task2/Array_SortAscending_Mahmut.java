package week07.task2;

import java.util.Arrays;

public class Array_SortAscending_Mahmut {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};

        sortAscending1(arr); //[7, 8, 9, 10]
        sortAscending2(arr);// [7, 8, 9, 10]

    }

    public static void sortAscending1(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++)

                if (arr[i] > arr[j]) {

                    int temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }
            //System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void sortAscending2(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    arr[i] = arr[i] + arr[j];

                    arr[j] = arr[i] - arr[j];

                    arr[i] = arr[i] - arr[j];
                }
                //System.out.println(Arrays.toString(arr));
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};

 */
