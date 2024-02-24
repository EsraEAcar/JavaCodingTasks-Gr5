package week01.task1;

public class EvenOrOdd___Mahmut {
    public static void main(String[] args) {


        System.out.println(OddOrEven(8)); // Even
        System.out.println(OddOrEven(7)); // Odd


    }

    public  static  String  OddOrEven(int number) {
        return  number%2==0 ? "Even" : "Odd" ;
    }
}
