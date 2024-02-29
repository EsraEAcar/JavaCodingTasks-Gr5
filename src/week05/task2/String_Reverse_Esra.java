package week05.task2;

public class String_Reverse_Esra {
    public static void main(String[] args) {


        reverseString("ABCD");
        reverseString("JAVA");


    }

    public static void reverseString(String str){

        String reversedString = "";

        for (int i = str.length()-1; i >=0 ; i--){

            char ch = str.charAt(i);

            reversedString+= ch;

        }

        System.out.println(reversedString);

    }
}


/*
2️⃣  String -- Reverse
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */