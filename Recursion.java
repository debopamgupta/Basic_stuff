import java.util.Scanner;

public class Recursion {

  // static int findSumOfDigits(int n) {
  // wap to find the sum of digits of a number with recursion
  // base case -> if the no of digits is one return that no itself
  // int copyn = n;
  // int c = 0;

  // while (n > 0) {
  // n = n / 10;
  // c++;
  // }

  // if (c == 1)
  // return copyn;

  // else {
  // return (copyn % 10) + findSumOfDigits(copyn / 10);

  // }
  // }

  static int sumNaturalNumbersRec(int x) {
    if (x == 1) {
      return 1;
    } else {
      return x + sumNaturalNumbersRec(x - 1);
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    int n = sc.nextInt();
    sc.close();
    System.out.println("Sum of the natural numbers upto " + n + "is " + sumNaturalNumbersRec(n));
  }
}