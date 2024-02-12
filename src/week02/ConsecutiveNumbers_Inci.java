package week02;

public class ConsecutiveNumbers_Inci {
    public static void main(String[] args) {
        ConsecutiveNumbers(17);

    }
    public static void ConsecutiveNumbers(int num){

        for (int i = 1; i <= num; i++) {
            String result = "";

            if (i % 2 == 0) {
                result += "Codility";
            } else if (i % 3 == 0){
                result += "Test";
            } else if (i % 5 == 0) {
                result = "Coders";

            }
            System.out.println(result.isEmpty() ? i : result);
        }

    }

}