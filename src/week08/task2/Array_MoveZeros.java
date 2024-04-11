package week08.task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_MoveZeros {

    public static void main(String[] args) {

        int[] arr = {1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZeros1(arr))); //[1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println(Arrays.toString(moveZeros2(arr))); //[1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println(Arrays.toString(moveZeros3(arr))); //[1, 2, 3, 4, 0, 0, 0, 0]

    }


    /**
     * This method moves all the zeros to last indexes of the array
     * @param  array
     * @return array with zeros at indexes of the array
     */

    public static int[] moveZeros1(int[] array){
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == 0) {

                    int temp = array[i];

                    array[i] = array[j];

                    array[j] = temp;
                }

            }
        }
        return array;
    }


    /**
     * This method moves all the zeros to last indexes of the array
     * @param  array
     * @return array with zeros at indexes of the array
     */


    public static int[] moveZeros2(int[] array){

        int[] newArray = new int[array.length];

        int i = 0;
        for (int each : array) {

            if (!(each== 0)) {
                newArray[i] = each;
                i++;
            }
        }

        return newArray;
    }


    /**
     * This method moves all the zeros to last indexes of the array
     * @param  array
     * @return array with zeros at indexes of the array
     */


    public static int[] moveZeros3(int[] array){

        int[] newArray = new int[array.length];

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (!(array[i]== 0)) {
                newArray[j] = array[i];
                 j++;
            }
        }

        return newArray;
    }

    /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */
}
