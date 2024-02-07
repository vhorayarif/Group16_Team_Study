package Week2;

public class Divisibleby3_5_15 {
    public static void main(String[] args) {
        System.out.println(DivisibleBy(100));

    }

    public static String DivisibleBy(int n) {
        String DivisibleBy15 = "Divisible By 15: ";
        String DivisibleBy5 = "Divisible By 5: ";
        String DivisibleBy3 = "Divisible By: ";
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                DivisibleBy15 += i + " ";
            }
            if (i % 5 == 0) {
                DivisibleBy5 += i + " ";
            }
            if (i % 3 == 0) {
                DivisibleBy3 += i + " ";
            }

        }
        return DivisibleBy15 + "\n" + DivisibleBy5 + "\n" + DivisibleBy3;


    }
}
