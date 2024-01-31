public class OddOrEven {
    public static void main(String[] args) {
        int number = -23; // You can change this number to test different inputs
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static boolean isEven(int number) {
        // A number is even if it's divisible by 2 without any remainder
        // Otherwise, it's odd
        return number % 2 == 0; //test
    }
}
