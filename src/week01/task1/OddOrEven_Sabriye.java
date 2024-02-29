package week01.task1;

public class OddOrEven_Sabriye {
    public static void main(String[] args) {
        IsEvenOrOdd(5);
        IsEvenOrOdd(6);
    }

    public static void IsEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
/*
     Numbers - Odd or even:
     Write  a method which can identify given number is even or odd
     Output ex:
     identify(5); ->"Odd"
     identify(6); ->"Even"
     */

