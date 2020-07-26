import java.util.Scanner;

class FillArrayWithPrimeNumbers {
  static int n = 0;

  static boolean isprime(int x) {
    int fact = 0;
    for (int y = 1; y <= x; y++) {
      if (x % y == 0)
        fact++;
    }
    if (fact == 2) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter m and n");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int A[][] = new int[m][n];

    int p = 2;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n;) {

        if (isprime(p)) {
          A[i][j] = p;
          j++;
        }
        p++;
      }

    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(" " + A[i][j]);
      }
      System.out.println();
    }
    sc.close();
  }
}
