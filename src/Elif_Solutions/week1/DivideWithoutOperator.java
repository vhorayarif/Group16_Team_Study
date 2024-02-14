package Elif_Solutions.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {


        divide(5,8);

    }

    public static void divide(int n1, int n2) {

        if (n2 == 0) {
            System.out.println("invalid divisor");
            System.exit(1);
        }


        int count = 0;

        while (n1 >= n2) {
            count++;
            n1 -= n2;
        }

        System.out.println(count);


    }

}

