import java.util.*;

public class FibonacciRec {

  public void printfibo(int a, int b, int n) {
    int c;
    if (n == 0) // last element
      return;
    else {
      // first pass
      if (a == 0 && b == 1) {
        System.out.print(0 + " " + 1 + " ");
        c = a + b;
        System.out.print(c + " ");
        printfibo(b, c, (n - 3));
      } else {
        // consequent passes
        c = a + b;
        System.out.print(c + " ");
        printfibo(b, c, (n - 1));
      }
    }
  }

  public static void main(String[] args) {
    FibonacciRec obj = new FibonacciRec();
    System.out.println("Enter the no. of elements wanted in the series ....");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    obj.printfibo(0, 1, n);
    System.out.println();
  }
}

// other way as well.
