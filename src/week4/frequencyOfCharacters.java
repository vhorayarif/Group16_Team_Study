package week4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class frequencyOfCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(frequencyOfChar(word));

    }


    public static String frequencyOfChar (String input){

        String result = "";


        for (int i = 0; i < input.length(); i++) {

            int count = 0;

            for (int k = 0; k < input.length(); k++) {
                if (input.charAt(i) == input.charAt(k)) {
                    count++;
                }
            }

            if (!result.contains(input.charAt(i) + "")) {
                result += input.charAt(i) + "" + count;
            }

        }

        return result;



    }


}


