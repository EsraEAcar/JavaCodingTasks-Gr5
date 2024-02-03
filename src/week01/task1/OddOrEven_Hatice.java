package week01.task1;


public class OddOrEven_Hatice {

    public static void main(String[] args) {

        OddOrEven(34);

    }
        public static void OddOrEven(int number){

        String result = "";

        if (number % 2 == 0){
            result ="This number is even number";
        }else{
            result = "This number is odd number";
        }

        System.out.println(result);






    }

}
