package week01.task3;

import java.util.Scanner;

public class FINRA_gulizar {
    public static void main(String[] args) {
        Scanner Finra = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = Finra.nextInt();

        if (number % 3 == 0){
            System.out.println("FIN");

        } else if (number % 5 == 0) {
            System.out.println("RA");

        } else if (number % 3 == 0 && number % 5== 0) {
            System.out.println("FINRA");

        }else {
            System.out.println("Invailid number");
        }


    }

}
/*
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */