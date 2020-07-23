import java.util.Scanner;
/*
 Transpose - Java program to find out and print the transpose of a matrix
*/

public class Transpose {
  public static void main(String[] args) {
    int A[][];
    int T[][];
    int rows, cols;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of rows and cols");
    rows = sc.nextInt();
    cols = sc.nextInt();
    A = new int[rows][cols];
    T = new int[cols][rows];
    System.out.println("enter values");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    sc.close();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        T[j][i] = A[i][j];
      }
    }

    System.out.println("Original matrix");

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("Transposed matrix");

    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.print(T[i][j] + " ");
      }
      System.out.println();
    }

  }
}
