import java.util.Scanner;

public class Antispiral {
  public static void main(String[] args) {
    int A[][];
    System.out.println("enter limit of matrix");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    A = new int[n][n];
    int top = 0, bottom = n - 1, right = n - 1, left = 0;
    int num = 1;
    while (top <= bottom && right >= left) {
      // top row
      for (int j = right; j >= left; j--) {
        A[top][j] = num++;
      }
      top++; // increasing top for moving the upper limit to the next row

      // left column
      for (int i = top; i <= bottom; i++) {
        A[i][left] = num++;
      }
      left++; // moving the left one step to the right

      // bottom row
      for (int j = left; j <= right; j++) {
        A[bottom][j] = num++;
      }
      bottom--; // moving the bottom one step above

      // right column
      for (int i = bottom; i >= top; i--) {
        A[i][right] = num++;
      }
      right--; // moving the right one step to left
    }
    // printing
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}