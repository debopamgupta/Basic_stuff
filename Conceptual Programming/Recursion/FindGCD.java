import java.util.Scanner;

/*
using recursion do the following 

input two numbers from the userand find and print GCD using recursion

presume first one is greatest - no 
any sequence the no can be done
*/

public class FindGCD {
  public static int calculateGCD(int a, int b) {
    // If both the number are equal
    if (a == b)
      return a;
    /* If a is equal to zero then return b */
    else if (a == 0)
      return b;
    /* If b is equal to zero then return a */

    else if (b == 0)
      return a;
    else if (a > b)
      // Recursive call
      return calculateGCD(a % b, b);
    else
      // Recursive call
      return calculateGCD(a, b % a);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    System.out.println(calculateGCD(a, b));
  }
}