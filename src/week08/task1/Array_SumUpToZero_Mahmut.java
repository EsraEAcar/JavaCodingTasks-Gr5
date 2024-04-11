package week08.task1;

import java.util.Arrays;
import java.util.Random;

public class Array_SumUpToZero_Mahmut {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumUpToZero1(10)));// [1, -1, 3, -3, 5, -5, 7, -7, 9, -9]
        System.out.println(Arrays.toString(sumUpToZero1(11)));// [0, 1, -1, 3, -3, 5, -5, 7, -7, 9, -9]
        System.out.println(Arrays.toString(sumUpToZero2(10))); // [192, -192, 186, -186, 13, -13, 98, -98, 39, -39]
        System.out.println(Arrays.toString(sumUpToZero2(11))); // [0, 8, -8, 170, -170, 111, -111, 152, -152, 29, -29]
        System.out.println(Arrays.toString(sumUpToZero3(10))); // [1, 2, 3, 4, 5, -1, -2, -3, -4, -5]
        System.out.println(Arrays.toString(sumUpToZero3(11))); // [0, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5]

    }


    /**
     * This method returns an array containing N unique integers that sum up to 0.
     * @param N
     * @returnan array containing N unique integers that sum up to 0.
     */


    public static int[] sumUpToZero1(int N){

        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N out of the range of 1 and 99");
        }

        int[] arr = new int[N];

        // Handle odd and even cases differently
        if (N % 2 == 0) {

            // For even case, generate pairs of positive and negative numbers
            for (int i = 0; i < N; i += 2) {
                arr[i] = i +1;
                arr[i + 1] = -(i+1);
            }

        } else {

            // For odd case, start with 0 and generate pairs for remaining numbers
            arr[0] = 0;

            for (int i = 1; i < N; i += 2) {
                arr[i] = i;
                arr[i + 1] = -i;
            }
        }

        return arr;
    }


    /**
     * This method returns an array containing N unique integers that sum up to 0.
     * @param N
     * @returnan array containing N unique integers that sum up to 0.
     */


    public static int[] sumUpToZero2(int N){

        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N out of the range of 1 and 99");
        }

        int[] arr = new int[N];

        Random random = new Random();

        // Handle odd and even cases differently
        if (N % 2 == 0) {

            // For even case, generate pairs of positive and negative numbers
            for (int i = 0; i < N; i += 2) {

                // Generate random integers in the range [0, 200)
               int num = random.nextInt(200);

                if (!(arr[i] == num)  ){
                    arr[i] = num;
                    arr[i + 1] = -num;
                }

            }

        } else {

            // For odd case, start with 0 and generate pairs for remaining numbers
            arr[0] = 0;

            for (int i = 1; i < N; i += 2) {

                // Generate random integers in the range [0, 200)
                int num = random.nextInt(200);

                if (!(arr[i] == num)  ){
                    arr[i] = num;
                    arr[i + 1] = -num;
                }
            }
        }

        return arr;
    }


    /**
     * This method returns an array containing N unique integers that sum up to 0.
     * @param N
     * @returnan array containing N unique integers that sum up to 0.
     */


    public static int[] sumUpToZero3(int N){

        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N out of the range of 1 and 99");
        }

        int[] arr = new int[N];

        // Handle odd and even cases differently
        if (N % 2 == 0) {

            // For even case, generate pairs of positive and negative numbers for symmetric indexes
            for (int i = 0; i < N/2; i ++) {
                arr[i] = i +1;
                arr[N/2 + i] = -(i+1);
            }

        } else {

            // For odd case, start with 0 and generate pairs for remaining numbers
            arr[0] = 0;

            for (int i = 1; i <=N/2; i ++) {
                arr[i] = i;
                arr[N/2 + i] = -i;
            }
        }

        return arr;
    }



}
/*
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5]. The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
 */