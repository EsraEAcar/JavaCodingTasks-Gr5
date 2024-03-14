package week06.task2;

public class Array_FindMaximum_Esra {

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        findMaxNumber(arr);




    }

    public static void findMaxNumber(int[] arr){

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println("max = " + max);

    }


}

/*
 Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
