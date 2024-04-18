package week09.task1;

import java.util.Arrays;
import java.util.Collections;

public class Array_concat2Arrays_Esra {

    public static void main(String[] args){

        int[] arr1 = {7, 8, 9};
        int[] arr2 = {10, 11, 12, 13, 14};

        int[] arrConcat = concat2Arrays(arr1, arr2);

        System.out.println(Arrays.toString(arrConcat));


    }

    public static int[] concat2Arrays(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];

        int j = 0;
        for(int i = 0; i < arr1.length; i++){
            arr3[j] = arr1[i];
            j++;
        }

        for(int i = 0; i < arr2.length; i++){
            arr3[j] = arr2[i];
            j++;

        }

        return arr3;



    }


}


/*
Write a return method that can concatenate two arrays
 */
