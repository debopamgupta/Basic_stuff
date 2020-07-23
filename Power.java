import java.util.Scanner;

// take 2 values a and b assuming first one is base and next is power, calculate a ^ b and a^-b using recursion
class Power {

  static double findPower(int a, int b) {
    if (b == 0) {
      return 1.0;
    } else {
      return a * findPower(a, b - 1);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    if (b == 0) {
      System.out.println("" + 1);
    } else if (b > 0) {

      System.out.println("" + findPower(a, b));

    } else {

      double result = 1.0 / findPower(a, -b);
      System.out.println("" + result);
    }
  }
}