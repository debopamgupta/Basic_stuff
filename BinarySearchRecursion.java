import java.util.Scanner;

public class BinarySearchRecursion {

  int binarysearch(int a[], int low, int high, int s) {

    if (low == high) {
      return -1;
    }

    int mid = (int) Math.floor((low + high) / 2);

    if (a[mid] > s) {
      high = mid - 1;
      return binarysearch(a, low, high, s);
    }
    if (a[mid] < s) {
      low = mid + 1;
      return binarysearch(a, low, high, s);
    }
    if (a[mid] == s) {
      return mid;
    }

    return -1;
  }

  public static void main(String[] args) {
    int a[];

    System.out.println("Enter the number of the elements to be put in the array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    a = new int[n]; // initialising the array with the range
    for (int i = 0; i < n; i++) {
      // entering elements
      a[i] = sc.nextInt();
    }
    System.out.println("Enter an element to be searched");
    int e = sc.nextInt();
    sc.close();

    // sort the array as Binary search only works for sorted arrays
    for (int i = 0; i < a.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] < a[min]) {
          min = j;
        }
      }
      int temp = a[min];
      a[min] = a[i];
      a[i] = temp;
    }

    BinarySearchRecursion obj = new BinarySearchRecursion();
    int result = obj.binarysearch(a, 0, a.length - 1, e); // passing the index so length - 1

    // -1 if ele not found
    if (result == -1)
      System.out.println("Element not found");
    // print the position of found element
    else
      System.out
          .println("Element Found! Present At position " + (result + 1) + " of the array or at " + result + " index");

  }
}