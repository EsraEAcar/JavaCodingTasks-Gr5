package week01.task2;

public class DivideWithoutDivisionOperator_Inci {

        public static void main(String[] args) {
            Division(45, 6);

        }

        public static void Division(int num1, int num2) {
            int counter = 0;

            while (num1 >= num2) {
                num1 = num1 - num2;
                counter++;
            }
            System.out.println(counter + ", reminder is " + num1);

        }

    }


