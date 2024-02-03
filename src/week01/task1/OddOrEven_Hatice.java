package week01.task1;

import java.util.Scanner;

public class OddOrEven_Hatice {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int number = input.nextInt();
        String result = "";


        if (number % 2 == 0){
            result ="This number is even number";
        }else{
            result = "This number is odd number";
        }

        System.out.println(result);

        input.close();




    }

}
