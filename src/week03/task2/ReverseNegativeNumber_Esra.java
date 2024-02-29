package week03.task2;

public class ReverseNegativeNumber_Esra {
    public static void main(String[] args) {




            int givenNumber = -12365;
            String reversedNumber = "-";

            String convertedIntToString = String.valueOf(givenNumber);

            for(int i = convertedIntToString.length()-1; i >= 1; i--){
                reversedNumber += convertedIntToString.charAt(i);

            }

        System.out.println(reversedNumber);

        }
    }








/*
2️⃣ Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */