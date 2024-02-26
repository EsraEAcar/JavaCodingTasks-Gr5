package week04.task3;

public class String_RemoveDuplicates {

    public static void main(String[] args) {

        removeDup("AAABBBCCC");

        removeDup("LOVVVVEEEEE");





    }

    public static void removeDup(String str){
        String result = "";

        for(int i = 0; i < str.length(); i++){

            char eachChar = str.charAt(i);  // each character of the String str

            if(result.contains( eachChar + "")){ // if the string result contain the character of string str just continue, don't add
                continue;
            } else {
                result += eachChar; // if it does not contain add the character to string result
            }



        }
        System.out.println(result);





    }



}


/*
3️⃣  String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */