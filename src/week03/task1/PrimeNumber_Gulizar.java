package week03.task1;

import java.util.Arrays;

public class PrimeNumber_Gulizar {
    public static void main(String[] args) {

        int num = 17;
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }










    }

/*
Write a method that can check if a number is prime or not
 */
