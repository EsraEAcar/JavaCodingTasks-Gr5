package week01.task3;

public class FINRA_Mahmut {

    public static void main(String[] args) {

        finra(20);
    }
    public static void finra(int num) {
        String result = "";
        for (int i = 1; i < num; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result = "FINRA ";
            } else if (i % 3 == 0) {
                result = "FIN ";
            } else if (i % 5 == 0) {
                result = "RA ";
            } else {
                result = i + " ";
            }
            System.out.println(result);
        }

    }

    public static void main(String[] args) {

finra(30);

//Output:
//        1
//        2
//        FINRA
//        4
//        RA
//                FINRA
//        7
//        8
//        FINRA
//                RA
//        11
//        FINRA
//        13
//        14
//        FINRA
//        16
//        17
//        FINRA
//        19
//        RA
//                FINRA
//        22
//        23
//        FINRA
//                RA
//        26
//        FINRA
//        28
//        29
//        FINRA

    }

    public static void finra(int num){



        for(int i = 1; i <= num; i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println("FINRA");
            } else if(i % 5 == 0){
                System.out.println("RA");
            } else if(i % 3 == 0){
                System.out.println( "FINRA");
            } else{
                System.out.println(i);
            }
        }

    }



}


/*
3️⃣  Numbers -- FINRA
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */