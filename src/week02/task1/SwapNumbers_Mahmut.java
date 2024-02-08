package week02.task1;

public class SwapNumbers_Mahmut {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Original a : b = " + a + " : " + b);  // 10 : 20

        a = a + b; // 'a' is 30 and 'b' still is 20, sum of the 'a' and 'b' is assigned to 'a', value of the b is not updated

        b = a - b;  // ( sum - original value of b) equals to original value 'a', at this line original value of 'a' is assigned to 'b'(2=10)

        a = a -b;  // ( sum - current value of b)  equals to original value 'a'

        System.out.println("Swapped a : b = " + a + " : " + b); // 20: 10

        /*
         a = 10
         b=  20
         a = a + b =30
         b = 30 - 20 = a - b = 10
         a = 30 - 10 = a - b = 20

         */
    }
}
/*
Swap two variable values without using a third variable
 */