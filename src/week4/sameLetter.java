package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sameLetter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        System.out.println((sameLetters(word2,word1)));

    }

    public static boolean sameLetters(String firstString, String secondString){

        if(firstString.length() == secondString.length()){
            char[] firstWord = new char[firstString.length()];
            char[] secondWord = new char[secondString.length()];

            for(int i = 0; i < firstString.length();i++){
                firstWord[i] = firstString.charAt(i);
            }

            for(int i = 0; i < secondString.length();i++){
                secondWord[i] = secondString.charAt(i);
            }

            Arrays.sort(firstWord);
            Arrays.sort(secondWord);

            if(Arrays.equals(firstWord, secondWord)){
               return true;
           }
        }

        return false;


    }
}
