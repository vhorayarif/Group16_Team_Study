package amrullah.week1;

public class Division {

    public static void main(String[] args) {
        System.out.println(division(5, 3));

    }

    public static int division(int dividend, int divisor) {

        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }


        int count = 0;

        while ((dividend >= divisor)) {

            dividend -= divisor;
            count++;
        }


        return count;


    }

}