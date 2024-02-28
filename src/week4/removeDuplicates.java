package week4;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(removeDup(word));

    }

    public static String removeDup (String input){

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            if(!result.contains(input.charAt(i) + "")){
                result += input.charAt(i);
            }
        }

        return result;
    }

}
