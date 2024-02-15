package week03.task1;

public class PrimeNumber_Esra {
    public static void main(String[] args) {

        isPrimeNumber(8);
        isPrimeNumber(7);
        isPrimeNumber(15);
        isPrimeNumber(64);
        isPrimeNumber(5);


    }

    public static void isPrimeNumber(int n) {

String result = n + " is a prime number";

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                result = (n + " is not a prime number");
            }
        }

        System.out.println(result);
    }
}








/*
1️⃣ Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
 */