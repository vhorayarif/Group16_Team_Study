package Elif_Solutions.week1;

public class Finra {
    public static void main(String[] args) {

        finra(17);


    }


    public static void finra(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }


        }


    }

}
