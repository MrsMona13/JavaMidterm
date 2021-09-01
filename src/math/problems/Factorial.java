package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */


        public static long factorial(int n)
        {
            long fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            return fact;
        }

        public static void main(String[] args)
        {
            int n = 5;
            System.out.println("The Factorial of " + n + " is " + factorial(n));
        }
    }



