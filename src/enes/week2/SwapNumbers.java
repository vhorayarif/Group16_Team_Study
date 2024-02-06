package enes.week2;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int x = scan.nextInt();
        System.out.println("Please enter the second number");
        int y = scan.nextInt();

        if (x > 0 && y > 0) {

            y = y + x;

            x = y - x;

            y -= x;

            System.out.println("First number has been successfully swapped, the new value is: " + x);
            System.out.println("Second number has been successfully swapped, the new value is: " + y);

        }


        if (x < 0 && y < 0) { // x = -3 & y = - 11;

            y = y + x;

            x = y - x;

            y -= x;

            System.out.println("First number has been successfully swapped, the new value is: " + x);
            System.out.println("Second number has been successfully swapped, the new value is: " + y);

        }


        if (x < 0 || y < 0) { // x = -3 & y = 5;

            y = -y;

            y = y + x;

            x = y - x;

            y -= x;

            x = -x;

            System.out.println("First number has been successfully swapped, the new value is: " + x);
            System.out.println("Second number has been successfully swapped, the new value is: " + y);

        }


    }


}

/*
*Numbers -- Swap Numbers
Swap two variable' values without using a third variable
*
* */
