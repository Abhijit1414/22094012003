import java.util.Scanner;


public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {  // base case
            return 1;
        } else {
            return n * factorial(n - 1); // recursive case
        }
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
