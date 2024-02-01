import java.util.Scanner;

public class NumberDividWithoutOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        int a = sc.nextInt();
        System.out.println("enter second no");
        int b = sc.nextInt();

        if(b == 0){
            throw new ArithmeticException("can't divide by zero");
        }

        int count = 0;
        while(a >= b){
            a = a-b;
            count = count+1;

        }
        System.out.println("Divide is ::" + count);


    }

}

/*
Number -- Divide without / operator

Write a method that can divide two numbers without using division operator
 */