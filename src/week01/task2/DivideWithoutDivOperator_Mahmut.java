package week01.task2;

public class DivideWithoutDivOperator_Mahmut {

    public static void main(String[] args) {

        divide(6, 2); // 6 / 2 gives 3 with remainder 0
        divide(7, 2); //  7 / 2 gives 3 with remainder 1
        divide(8, 3); //  8 / 3 gives 2 with remainder 2
        divide(3, 5); //  3 / 5 gives 0 with remainder 3
    }

    public static void divide(int n1, int n2) {

        if (n2 == 0) {
            System.out.println("Zero can't be a division");
            return;
        }

        int count = 0;

        while (n1 >= n2) {
            count++;
            n1 -= n2;
        }

        System.out.println(n1 + " / " + n2 + " gives " + count + " with remainder " + n1);
    }
    public static void main(String[] args) {

        divideWithoutDivOp(7, 2);
        divideWithoutDivOp(15, 4);
        divideWithoutDivOp(64, 8);
        divideWithoutDivOp(36, 0);

//        Output:
//        7 / 2 = 3 with remainder 1
//        15 / 4 = 3 with remainder 3
//        64 / 8 = 8 with remainder 0
//        36 / 0 ---> CANNOT DIVIDE BY ZERO

    }

    public static void divideWithoutDivOp(int num1, int num2) {


        int count = 0;
        String result = num1 + " / " + num2 + " = ";

        if (num2 == 0) {
            System.out.println(num1 + " / " + num2 + " ---> CANNOT DIVIDE BY ZERO");
            return;

        }

        while( num1 >= num2){  //7, 2 -> 7 > 2 ? true  -> 7 - 2  = 5 (count = 1)  new num1 = 5, 5 > 2 ? true -> 5 - 2 = 3 (count = 2), num1 = 3, 3 > 2 ? true 3 - 2 = 1 (count = 3) num1 = 1, 1 > 2 false stop --> remainder = 1
            count++;
            num1 -= num2;  // num1 = num1 - num2
        }


        System.out.println(result +
         count + " with remainder " + num1);





    }


}



/*

2️⃣  Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */
