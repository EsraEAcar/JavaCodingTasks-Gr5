package week04.task1;

public class Frequency_of_Characters_Abeer {


    public static void main(String[] args) {


        String Word_Frecuncy=frequencyOfChars("AAABBCDD");
        System.out.println(Word_Frecuncy);


    }


    public static String frequencyOfChars(String str)
    {

        String result = "";
        for (int x = 0; x < str.length(); x++) {

            char ch = str.charAt(x);

            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);
                if(ch == each){
                    count++;
                }
            }

            if (result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;
        }

        return result;

    }

}
