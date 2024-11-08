import java.util.Scanner;

public class CombinedProblems
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Problem 1: Print odd numbers between two entered numbers
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print("Odd numbers between " + a + " and " + b + ": ");
        for (int i = a; i <= b; i++)
        {
            if (i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For a new line after Problem 1's output

        // Problem 2: Print each digit of a positive integer in place value
        System.out.print("Enter a positive integer:\n> ");
        int N = sc.nextInt();
        int degree = 0;

        System.out.println("Digits in place values:");
        while (N > 0)
        {
            int lastDigit = N % 10;
            N /= 10;

            // Calculate the place value and print the digit with its place
            double placeValue = Math.pow(10, degree);
            System.out.println((int)(lastDigit * placeValue));

            degree++;
        }

        sc.close();
    }
}
