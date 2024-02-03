package week01.task2;

public class DivideWithoutDivisionOperator_Hatice {
    public static void main(String[] args) {

        Division(23,5);
    }

    public static void Division(int num1, int num2){

        int counter = 0;

        while (num1>= num2){
            num1 -= num2;
            counter++;
        }

        System.out.println(counter +", and reminder is "+num1);

    }


}
