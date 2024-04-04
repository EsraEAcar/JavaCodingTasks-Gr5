package week07.task2;
import java.util.Arrays;

public class Array_SortAscending_Esra {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
        sortAsc(arr);




    }

    /**
     * Sorting an array
     * @param arr
     */
    public static void sortAsc(int[] arr){

        Arrays.sort(arr);
        System.out.print("Elements of array sorted in ascending order: \n");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+ ", ");

        }


    }



    }



/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
 */