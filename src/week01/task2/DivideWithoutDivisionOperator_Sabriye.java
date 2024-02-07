package week01.task2;

public class DivideWithoutDivisionOperator_Sabriye {

    public static void main(String[] args) {
        System.out.println((divide(34,-3)));
        System.out.println(34/-3);
    }

        public static int divide(int dividend, int divisor) {
            if (divisor == 0) {
                throw new ArithmeticException("Divisor cannot be zero");
            }

            int quotient = 0;
            int sign = dividend * divisor < 0 ? -1 : 1;

            dividend = dividend >= 0 ? dividend : (-1 * dividend);
            divisor = divisor >= 0 ? divisor : (-1 * divisor);

            while (dividend >= divisor) {
                dividend -= divisor;
                quotient++;
            }

            return sign * quotient;
        }
    }



/*
     Numbers - Divide without / operator:
     Write a method that can divide two numbers without using division operator
     */
