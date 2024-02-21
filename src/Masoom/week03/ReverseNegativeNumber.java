package Masoom.week03;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        int number = -35;
        int reverseNumber = 0;

        while (number != 0);{

        }
        int lastDigit = number % 10;
        reverseNumber = reverseNumber * 10 + lastDigit;
        number = number/10;
        System.out.println("Reverse of a given number is:" + reverseNumber);
    }

}
