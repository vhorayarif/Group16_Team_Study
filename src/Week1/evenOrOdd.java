package Week1;

public class evenOrOdd {
    public static void main(String[] args) {

    }

    public static String oddOrEven(int num) {
        String oddOrEven = "";
        if (num % 2 == 0) {
            oddOrEven += "Even";
        } else {
            oddOrEven += "Odd";
        }
        return oddOrEven;
    }
}
