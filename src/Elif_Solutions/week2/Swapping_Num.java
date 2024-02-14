package Elif_Solutions.week2;

public class Swapping_Num {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;


        System.out.println("Before swapping x = " + x + " and y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping x = " + x + " and y = " + y);

        // updated project
    }
}