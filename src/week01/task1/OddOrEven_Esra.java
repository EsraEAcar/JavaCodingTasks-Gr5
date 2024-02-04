package week01.task1;

public class OddOrEven_Esra {

    public static void main(String[] args) {

        identify(6);
        identify(5);
        identify(112);

    }

public static void identify(int num){

        if(num %2 == 0){
            System.out.println(num + " is even");
        } else{
            System.out.println(num + " is odd");
        }



}




}



/*

1️⃣  Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */