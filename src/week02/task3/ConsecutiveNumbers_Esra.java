package week02.task3;

public class ConsecutiveNumbers_Esra {

    public static void main(String[] args) {

        ConsecutiveNumbers(17);

      //  ConsecutiveNumbers(12);

      //  ConsecutiveNumbers(60);

    }

    public static void ConsecutiveNumbers(int n) {


        // divisible by 2  --> Codility
        // divisible by 3  --> Test
        // divisible by 5  --> Coders


        for (int i = 1; i <= n; i++) {

            String divBy2 = "Codility";
            String divBy3 = "Test";
            String divBy5 = "Coders";
            String result = "";

            if (i % 2 == 0) {
                result += divBy2;
            }

            if (i % 3 == 0) {
                result += divBy3;
            }

            if (i % 5 == 0) {
                result += divBy5;
            }
            System.out.println(result.isEmpty()? i : result);
        }


    }
}











/*
3️⃣ Numbers -- print consecutive numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N,
each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

For example, here is the output for N = 17:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
 */