package week01.task1;

import java.util.Scanner;

public class OddOrEven_Abeer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Inter Your Number");
        int Num = input.nextInt();
        input.close();
        if (Num % 2 == 0) {

            System.out.println("" + Num + " is even number ");
        } else {

            System.out.println("" + Num + " is odd number ");
        }

    }

}
