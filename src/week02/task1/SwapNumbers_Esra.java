package week02.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapNumbers_Esra {
    public static void main(String[] args) {


        int num1 = 12;
        int num2 = 7;

        ArrayList<Integer> twoNum = new ArrayList<>();

        twoNum.addAll(Arrays.asList(num1, num2));

        System.out.println(twoNum);

        num1 = twoNum.get(1);
        num2 = twoNum.get(0);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }

}



/*
1️⃣ Numbers -- Swap Numbers
Swap two variable values without using a third variable
 */