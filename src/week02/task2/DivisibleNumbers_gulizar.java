package week02.task2;

public class DivisibleNumbers_gulizar {
    public static void main(String[] args) {

int n1 = 3;
int n2 = 5;
int n3 = 15;

String divisible15 = " ";
String divisible5= " ";
String divisible3= " ";


for (int i = 1; i<=100; i++) {
    if (i % 15 == 0 && i % 5 == 0 ) {
        divisible15 += i + " ";

    }
    if (i % 5 ==0 && i % 15 !=0){
        divisible5 += i + " ";
    }
    if (i % 3 == 0 && i % 15 != 0){
        divisible3 += i + " ";
    }

}
        System.out.println("Divisible by 15: " + divisible15);
        System.out.println("Divisible by 5: " + divisible5);
        System.out.println("Divisble by 3: " + divisible3);

      /*

Numbers -- Divisible by 3, 5, 15**__
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
-if the number can be divisible by 3, 5 and 15, then it should only be displayed in **DivisibelBy15 **section
-if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in **DivisibelBy3 **section
-if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in **DivisibelBy5 **section
**ex: **
**OutPut:**
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99



       */
    }
}
