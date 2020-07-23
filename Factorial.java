
import java.util.Scanner;

public class Factorial {
  public static void main(final String[] args) {

    int A[][], rs, cs;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter matrix rows and cols size");
    rs = sc.nextInt();
    cs = sc.nextInt();

    A = new int[rs][cs];
    System.out.println("Enter matrix values");

    for (int i = 0; i < rs; i++) {
      for (int j = 0; j < cs; j++) {
        A[i][j] = sc.nextInt();
      }
      System.out.println();
    }
    System.out.println("Orig matrix");
    for (int i = 0; i < rs; i++) {
      for (int j = 0; j < cs; j++) {
        System.out.print(A[i][j]);
      }
      System.out.println();
    }
    sc.close();
  }
}