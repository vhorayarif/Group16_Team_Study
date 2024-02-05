package enes.week1;

public class FINRA {

    public static void main(String[] args) {

        finra();

    }

    public static void finra() {

        for (int i = 0; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("FINRA");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");

            } else {
                System.out.println(i);
            }


        }


    }
}
