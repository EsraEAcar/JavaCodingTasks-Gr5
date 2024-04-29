package week09.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveSomeValues_Esra {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        // Removing values greater than 100 from the list
        List<Integer> removedNumbers = removeGreaterThan100(numbers);

        // Print changed list
        System.out.println("List after removing values greater than 100:");
        for (Integer number : removedNumbers) {
            System.out.println(number);
        }
    }

    public static List<Integer> removeGreaterThan100(List<Integer> numbers) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer number : numbers) {
            if (number <= 100) {
                filteredList.add(number);
            }
        }
        return filteredList;
    }


}

/*
Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
 */