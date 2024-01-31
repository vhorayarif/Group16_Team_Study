public class DivideWithoutOperator {
    public static void main(String[] args) {
        System.out.println(Result(144,12));

    }

    public static int Result(int n, int m) {
        int count = 0;
        while (n >= m) {
            n -= m;
            count++;
        }
        return count;
    }
}
