package week01.task3;

public class FINRA_Hatice {

    public static void printFINRA(int num) {

        if (num < 0 || num > 30) {
            System.out.println("Invalid number");
            return;
        }


        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FINRA");
        } else if (num % 3 == 0) {
            System.out.println("FIN");
        } else if (num % 5 == 0) {
            System.out.println("RA");
        } else {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        // Call the method
        printFINRA(30);
        printFINRA(23);
        printFINRA(55);

    }

}
