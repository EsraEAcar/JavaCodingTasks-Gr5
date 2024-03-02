package week04.task3;

public class RemoveDuplicates_gulizar {

    public static void main(String[] args) {
        System.out.println(RemoveDuplicates("AAABBBCCC"));
    }

    public static String RemoveDuplicates(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);

            if (!result.contains(""+ch1)){
                result += ch1;
            }

        }
        return result;

    }

}
/*
    String - Remove Duplicates
    Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
     */