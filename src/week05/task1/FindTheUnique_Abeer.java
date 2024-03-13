package week05.task1;

import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique_Abeer {

    public static void main(String[] args) {

        System.out.println(UniqueChar("AAABBBCCCDEF"));


    }

    public static String UniqueChar(String str)
    {

        String unique="";
        String [] array=str.split("");
        for (String each : array ) {
            int Unique = Collections.frequency( Arrays.asList( array )  , each );
            if(Unique == 1)
             unique+=each   ;
        }


        return unique;
    }


}
