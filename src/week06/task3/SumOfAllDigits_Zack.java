package week06.task3;

public class SumOfAllDigits_Zack {
    /*
    ====== String_SumOfAllDigits ===============
        Write a method that can return the sum of the digits in a String
             Ex:  "12 java 5 apple 3"  ==>  20
     */
    public static void main(String[] args) {
        String sentence = "12 java 5 apple 3"; // ==>  12 + 5 + 3 = 20
        System.out.println("sumOfDigits(sentence) = " + sumOfDigits(sentence));
    }

    /**
     * return the sum of the digits in a String
     * @param str String including digits
     * @return int
     */
    public static int sumOfDigits(String str) {
        int total = 0;

        for ( String word : str.split(" ")){

               try{
                   total += Integer.parseInt(word);
               }catch(Exception e){
                   //if the word does not fully contain digits, skip that word
               }
        }

        return total;
    }
}
