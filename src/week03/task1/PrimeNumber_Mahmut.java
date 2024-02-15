package week03.task1;

public class PrimeNumber_Mahmut {

    public static void main(String[] args) {
        isPrimeNumber1(29); // 29 is a Prime Number
        isPrimeNumber1(100); // 100 is not a Prime Number

        isPrimeNumber2(29); // 29 is a Prime Number
        isPrimeNumber2(100); // 100 is not a Prime Number

    }

    public static void isPrimeNumber1 (int n){

        boolean check = true;

        for (int i = 2; i < n; i++) {

            if(n%i == 0){
                check = false;
            }

        }

        if (check){
            System.out.println(n + " is a Prime Number");
        }else {
            System.out.println(n + " is not a Prime Number");
        }
    }


    public static void isPrimeNumber2 (int n){

       String result = "";

        for (int i = 2; i < n; i++) {

            if(n%i == 0){

                result +=i;

            }

        }

        if (result.isEmpty()){
            System.out.println(n + " is a Prime Number");
        }else {
            System.out.println(n + " is not a Prime Number");
        }
    }
}
/*
Write a method that can check if a number is prime or not
 */