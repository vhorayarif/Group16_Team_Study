package Elif_Solutions.week2;

public class consecutive_num {
    public static void main(String[] args) {

        consecutiveNum(17);
    }

    public static void consecutiveNum(int n) {

        for (int i = 1; i <= n; i++) {

            String result = "";

            if (i % 2 == 0) {
                result += "Codility";
            }

            if (i % 3 == 0) {
                result += "Test";
            }

            if (i % 5 == 0) {
                result += "Coders";
            }


            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }


        }

    }

}