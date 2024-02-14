package Elif_Solutions.week2;

import java.util.Scanner;

public class Divisibleby15_5_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter number ");
        int num1 = input.nextInt();

        String divisibleBy3 = "";
        String divisibleBy5 = "";
        String divisibleBy15 = "";

        for(int i = 1; i <= num1; i++){

            if(i % 15 == 0){
                divisibleBy15 += i + " "; // concatenate

            } else if(i % 5 == 0){
                divisibleBy5 += i + " ";

            } else if(i % 3 == 0){
                divisibleBy3 += i + " ";
            }
        }

        System.out.println("Divisible by 15: " + divisibleBy15);
        System.out.println("Divisible by 5: " + divisibleBy5);
        System.out.println("Divisible by 3: " + divisibleBy3);




    }


}








