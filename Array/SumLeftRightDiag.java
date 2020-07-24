import java.util.Scanner;

/**
 * SumLeftRightDiag - Java program to find out the sum of left and right
 * diagonal
 */
public class SumLeftRightDiag {

  public static void main(String[] args) {
    int r, c, sumLeft = 0, sumRight = 0;
    int A[][];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the rows and cols");
    r = sc.nextInt();
    c = sc.nextInt();
    A = new int[r][c];
    System.out.println("enter the values");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    sc.close();
    // has to be a sq matrix
    if (r != c) {
      System.out.println("not a square matrix hence cannot find diagonals");
    } else {
      // left diag
      for (int i = 0; i < r; i++) {
        sumLeft += A[i][i];
      }
      // right diag
      for (int i = 0; i < r; i++) {
        sumRight += A[i][r - i - 1];
      }

      System.out.println("The left diag sum is " + sumLeft);
      System.out.println("The right diag sum is " + sumRight);
    }

  }
}