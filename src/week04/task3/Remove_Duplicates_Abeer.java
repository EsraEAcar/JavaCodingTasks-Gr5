package week04.task3;

public class Remove_Duplicates_Abeer {

    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));

    }

    public static String removeDup(String str)
    {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (result.contains(""+ch)){
                continue;
            }

            result += ch;
        }

        return result;    }


}
