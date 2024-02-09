package week01.task2;

public class DivideWithoutDivOperator__Mahmut {

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

        System.out.print (n1 + " / " + n2  );

        int count = 0;

        while (n1 >= n2) {
            count++;
            n1 -= n2;
        }

        System.out.print( " gives " + count + " with remainder " + n1 + "\n");
    }
}



/*

2️⃣  Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */

