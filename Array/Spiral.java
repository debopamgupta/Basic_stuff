import java.util.Scanner;

public class Spiral {
  public static void main(String[] args) {

    System.out.println("Enter the number for n*n matrix");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int A[][] = new int[n][n];
    int left = 0, right = n - 1, top = 0, bottom = n - 1;
    int num = 1;
    while ((left <= right) && (top <= bottom)) {

      for (int j = left; j <= right; j++) {
        A[top][j] = num++;
      }
      top++;
      for (int i = top; i <= bottom; i++) {
        A[i][right] = num++;
      }
      right--;
      for (int j = right; j >= left; j--) {
        A[bottom][j] = num++;
      }
      bottom--;
      for (int i = bottom; i >= top; i--) {
        A[i][left] = num++;
      }
      left++;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}
