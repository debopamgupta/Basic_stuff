import java.util.*;

class UserDefinedSquareMatrixFilling {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n");
    n = sc.nextInt();
    int a[][], r1 = 0, c1 = 0, r2 = n - 1, c2 = n - 1, i, j, r, c;
    a = new int[n][n];
    int k = 1;
    while (k <= (n * n)) {
      for (i = c1; i <= c2; i++) {
        a[r1][i] = k;
        k++;
      }
      for (j = r1 + 1; j <= r2; j++) {
        a[j][c2] = k;
        k++;
      }
      for (i = c2; i >= c1; i--) {
        a[r2][i] = k;
        k++;
      }
      for (j = r2 - 2; j >= r1 + 1; j--) {
        a[j][c1] = k;
        k++;
      }
      r1++;
      c1++;
      c2--;
      r2--;
    }
    for (r = 0; r < n; r++) {
      for (c = 0; c < n; c++) {
        System.out.print(a[r][c] + " ");
      }
      System.out.println();
    }
  }
}
