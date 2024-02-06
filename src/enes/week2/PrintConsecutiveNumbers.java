package enes.week2;

import java.util.Scanner;

public class PrintConsecutiveNumbers {

    public static void main(String[] args) {

        consecutive();

    }


    public static void consecutive() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the last number you wish to print until: ");

        int n = scan.nextInt();


        for (int i = 1; i <= n; i++) {


            if (i % (2 * 3 * 5) == 0) {

                System.out.println("CodilityTestCoders");
            } else if (i % (3 * 5) == 0) {
                System.out.println("TestCoders");
            } else if (i % (2 * 5) == 0) {
                System.out.println("CodilityCoders");
            } else if (i % (2 * 3) == 0) {
                System.out.println("CodilityTest");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else {
                System.out.println(i);
            }


        }


    }


}


/*
*
Numbers -- print consecutive numbers
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
*  However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
*  If a number is divisible by more than one of the numbers: 2,3 or 5,
* it should be replaced by a concatenation of the respective words Codility, Test and Coders in this
given order.
* For example, numbers divisible by both 2 and 3 should be replace by CodilityTest and numbers divisible by all
three numbers: 2,3 and 5, should be replaced by CodilityTestCoders
For example, here is the output for N=24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codlity
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
*
*
* */
