package week1;

public class DivisionWithoutDivOperator {
        public static void main(String[] args) {
            int dividend = 21;
            int divisor = 3;

            int quotient = divide(dividend, divisor);

            System.out.println(dividend + " divided by " + divisor + " is " + quotient);
        }

        public static int divide(int dividend, int divisor) {
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            int quotient = 0;

            while (dividend >= divisor) {
                dividend -= divisor;
                quotient++;
            }

            return quotient;
        }
    }
