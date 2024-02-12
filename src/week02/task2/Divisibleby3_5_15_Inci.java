package week02.task2;

public class Divisibleby3_5_15_Inci {

    public static void main(String[] args) {



        for (int i = 1; i < 100; i++){


            if (i > 1 && i < 100) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " is DivisibelBy15 ");

                } else if (i % 5 == 0 && (!(i % 15 == 0))) {
                    System.out.println(i + " is DivisibelBy5 ");

                } else if (i % 3 == 0 && (!(i % 15 == 0))) {
                    System.out.println(i + " is DivisibelBy3 ");
                }

            }

        }

    }
}