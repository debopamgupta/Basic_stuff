import java.util.Scanner;

/**
 * Add Two Matrices given in any order.
 */

public class AddTwoMatrices {
  public static void main(String[] args) {
    int m, n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the rows and cols of the matrices");
    m = sc.nextInt();
    n = sc.nextInt();
    int A[][] = new int[m][n];
    int B[][] = new int[m][n];

    int Sum[][] = new int[m][n];
    System.out.println("enter the values in the matrix A");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        A[i][j] = sc.nextInt();
      }
    }

    System.out.println("enter the values in the matrix B");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        B[i][j] = sc.nextInt();
      }
    }
    sc.close();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        Sum[i][j] = A[i][j] + B[i][j];
      }
    }
    System.out.println("the sum of the matrices are");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(Sum[i][j] + "  ");
      }
      System.out.print("\n");
    }
  }
}