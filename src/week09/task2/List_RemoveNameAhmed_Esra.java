package week09.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNameAhmed_Esra {

    public static void main(String[] args){

        List<String> names = Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Zack");

        // Removing "Ahmed" from the list and getting the modified list
        List<String> modifiedNames = removeName(names, "Ahmed");

        // Printing the modified list
        System.out.println("Modified list after removing 'Ahmed':");
        for (String name : modifiedNames) {
            System.out.println(name);
        }


    }

    public static List<String> removeName(List<String> names, String nameToRemove) {
        names = new ArrayList<>(names); // Create a new ArrayList to make the list modifiable
        names.removeAll(Arrays.asList(nameToRemove));
        return names;
    }

}


/*
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Zack".....
Write a java operation to remove all the names named Ahmed
 */
