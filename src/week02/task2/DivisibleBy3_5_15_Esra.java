package week02.task2;


import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleBy3_5_15_Esra {

    public static void main(String[] args) {


        ArrayList<Integer> DivisibleBy15 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy3 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy5 = new ArrayList<>();

        int n = 100;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    DivisibleBy15.addAll(Arrays.asList(i));
                }
            }if (i % 3 == 0){
                if (i % 15 != 0) {
                    DivisibleBy3.addAll(Arrays.asList(i));
                }
            }if (i % 5 == 0){
                if (i % 15 != 0) {
                    DivisibleBy5.addAll(Arrays.asList(i));
                }
            }

        }
        System.out.println("Divisible by 15 " + DivisibleBy15);
        System.out.println();
        System.out.println("Divisible by 3 " + DivisibleBy3);
        System.out.println();
        System.out.println("Divisible by 5 " + DivisibleBy5);
    }
}






/*
2️⃣ Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
-if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section
-if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section
-if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */