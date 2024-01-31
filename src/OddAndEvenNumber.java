public class OddAndEvenNumber {

    public static void main(String[] args) {

        System.out.println(identfy(5));


    }
 public static String identfy(int num){
        if(num%2==0){
            return "even";
        }else{
            return "odd";
        }
 }


}

/*

Write a method which can identifies given number is even or odd
EX:
  identify(5)  -> "Odd"
  identify(6) - > "Even"
 */