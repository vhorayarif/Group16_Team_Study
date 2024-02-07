package Week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        System.out.println(Result(144, 12));

    }

    public static int Result(int n, int m) {
        if (m == 0) {
            throw new RuntimeException("Division by zero is not allowed ");
        }
        int count = 0;
        while (n >= m) {
            n -= m;
            count++;
        }
        return count;
    }
}
