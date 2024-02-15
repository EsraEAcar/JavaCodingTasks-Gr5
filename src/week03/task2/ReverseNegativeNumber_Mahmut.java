package week03.task2;

public class ReverseNegativeNumber_Mahmut {

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber1(-153));// -351
        System.out.println(reverseNegativeNumber2(-153)); // -351

    }

    public static int reverseNegativeNumber1(int n){
        int m = -n; //  positive numbers are easier to handle

        String result = "";

        while(m>0){ //53

            result += m%10; // 3 ==> 35

            m = m/10;

        }
        return -Integer.parseInt(result);
    }
    public static int reverseNegativeNumber2(int n) {

        int m = -n; //  positive numbers are easier to handle

        String strNum = "" + m;

        String[] strDigits = strNum.split("");

        String reversedNum = "";

        for (int i = strDigits.length - 1; i >= 0; i--) {

            reversedNum +=strDigits[i];
        }

        return -Integer.parseInt(reversedNum);
    }
}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */