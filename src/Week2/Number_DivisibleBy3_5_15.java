package Week2;

public class Number_DivisibleBy3_5_15 {

    public static void main(String[] args) {

        int n = 100;
        String by15 = "" ,  by5 = "" , by3 = "";

        for (int i = 1; i <= n ; i++) {

            if(i  % 15 == 0){
                by15 += i + " ";
            } else if (i % 5 == 0 ) {
                by5 += i + " ";


            } else if (i % 3 == 0) {
                by3 += i + " ";



            }

        }

        System.out.println("Divisible by 15: " + by15);
        System.out.println("Divisible by 5: " + by5);
        System.out.println("Divisible by 3: " + by3);






    }
}


/*
Number -- Divisible by 3, 5, 15

Write a program that can print the numbers between 1 ~ 100 that can be divisible by  3, 5 and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in Divisible by 15 section

if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in Divisible By 3 section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5 section

ex:
output: 100
  Divisible By 15 15 30 45 60 70 80 85 95 100
  Divisible by 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
  Divisible by 33 69 12 18 21 24 27 33 36 42  48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */