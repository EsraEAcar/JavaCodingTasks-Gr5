package week01.task3;

public class FINRA_Abeer {
    public static void main(String[] args) {

        for (int x = 1; x <= 30; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.print("FINRA" + " ");
            } else if (x % 3 == 0) {
                System.out.print("FIN" + " ");
            } else if (x % 5 == 0) {
                System.out.print("RA" + " ");
            } else {
                System.out.print(x + " ");
            }
        }
    }
    }
