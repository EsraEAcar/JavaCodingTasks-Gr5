package week05.task2;

public class Reverse_gulizar {

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));

    }

    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i>=0; i--) {
            result += str.charAt(i);

        }
        return result;
    }

}
/*
String -- Reverse
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */