package enes.week1;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(isEvenOrOdd(1245));
        System.out.println(isEvenOrOdd(-1242));

    }

    public static String isEvenOrOdd(int num) {


        int n = num;

        String evenOrOdd;

        boolean isEven = false;

        if (n % 2 == 0) {

            isEven = true;
        }

        if (isEven) {

            evenOrOdd = "Even";
        } else {

            evenOrOdd = "Odd";
        }

        return evenOrOdd;
    }

}
