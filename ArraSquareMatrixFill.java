import java.util.Scanner;

class SquareMatrixFill {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n");
    n = sc.nextInt();
    int a[][], r1 = 0, c1 = 0, r2 = n - 1, c2 = n - 1, r, c;
    a = new int[n][n];
    int k = 1;
    while (k <= (n * n)) {
      for (int i = c1; i <= c2; i++) {
        a[r1][i] = k;
        k++;
      }
      r1++;
      for (int i = r1; i <= r2; i++) {
        a[i][c2] = k;
        k++;
      }
      c2--;
      for (int i = c2; i >= c1; i--) {
        a[r2][i] = k;
        k++;
      }
      r2--;
      for (int i = r2; i >= r1; i--) {
        a[i][c1] = k;
        k++;
      }
      c1++;
    }

    for (r = 0; r < n; r++) {
      for (c = 0; c < n; c++) {
        System.out.print(a[r][c] + "\t");
      }
      System.out.println();
    }
  }
}
