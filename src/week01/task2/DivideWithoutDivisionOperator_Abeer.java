package week01.task2;

import java.util.Scanner;

public class DivideWithoutDivisionOperator_Abeer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Two Numbers :");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = num1;


        int count;
        for(count = 0; num1 > 0 && num2 <= num1; ++count) {
            num1 -= num2;
        }

        System.out.println("" + num3 + "/" + num2 + "= " + count);
        input.close();
    }

}
