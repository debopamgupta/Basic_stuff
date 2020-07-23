// Create a matrix of m * n order and find out the sum of the boundary elements
// and sum of the non boundary elements

import java.util.Scanner;

class Boundary {

  public static void main(String args[]) {

    int A[][], r, c, rs, cs, sB = 0, sN = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the row size");
    rs = sc.nextInt();
    System.out.print("Enter the column size");
    cs = sc.nextInt();
    A = new int[rs][cs];

    for (r = 0; r < rs; r++) {
      for (c = 0; c < cs; c++) {
        System.out.print("ENTER THE ELEMENTS OF ARRAY A");
        A[r][c] = sc.nextInt();
      }
    }
    System.out.println("Original matrix");
    for (r = 0; r < rs; r++) {
      for (c = 0; c < cs; c++) {
        System.out.print(A[r][c] + " ");
      }
      System.out.println();
    }

    System.out.println("The sum of boundary matrix  is:-");
    for (r = 0; r < rs; r++) {
      for (c = 0; c < cs; c++) {

        // for first and last one check rows = 0 or it is the last row
        // for middle things check col is 0 or it is the last col
        // otherwise it is non Boundary
        if (r == 0 || r == rs - 1 || c == 0 || c == cs - 1) {
          System.out.print(A[r][c] + " ");
          sB = sB + A[r][c];
        } else {
          System.out.print("  ");

        }
      }
      System.out.println();
    }

    System.out.println("The non-boundary matrix is:-");
    for (r = 0; r < rs; r++) {
      for (c = 0; c < cs; c++) {

        if ((r != 0 && r != rs - 1) && (c != 0 && c != cs - 1)) {
          System.out.print(A[r][c] + " ");
          sN = sN + A[r][c];
        } else {
          System.out.print("  ");

        }
      }
      System.out.println();
    }

    System.out.println("The sum of Boundary is:- " + sB);
    System.out.println("The sum of non- Boundary is:- " + sN);
  }
}