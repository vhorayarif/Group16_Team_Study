package enes.week1;
public class Divide {

    public static void main(String[] args) {

        int a = divide(144, 12);

        System.out.println(a);

    }


    public static int divide(int n, int m) {

        int count = 0;

        if (n >= m && m != 0) {

            while (n > 0) {

                if (n >= m) {
                    count++;
                }

                n -= m;


            }
        }

        return count;
    }
}
