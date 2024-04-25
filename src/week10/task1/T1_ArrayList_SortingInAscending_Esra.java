package week10.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class T1_ArrayList_SortingInAscending_Esra {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 1, 12, 88, 24));

        System.out.println("Before sorting: " + numbers);

        sortArrayListAsc(numbers);

        System.out.println("After sorting: " + numbers);
    }

    /**
     * sort an ArrayList in ascending Order
     * @param arr
     */
    public static void sortArrayListAsc(ArrayList<Integer> arr) {

        for (int i = 0; i < arr.size() - 1; i++) {  // starts with first element of the ArrayList
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {  // Swap arr[j] and arr[j+1]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}




/*
Write a method that can sort the ArrayList in Ascending order without using the sort method.
 */