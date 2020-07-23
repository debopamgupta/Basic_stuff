import java.util.Scanner;

class SumOfSquares {

  static int findSumOfSquare(int n) {
    if (n == 1) {
      return 1;
    } else {
      return ((n * n) + findSumOfSquare(n - 1));
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int x = sc.nextInt();
    sc.close();
    System.out.println("The sum of the natural nos upto the number entered is " + findSumOfSquare(x));
  }
}