import java.util.Scanner;

public class JoinTwoArrays {
  int a[];
  int l;
  static int res[];

  JoinTwoArrays() {
    // constructor
    l = 0;
  }

  void getData() {
    // read values of arr from user A and B
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of array");
    l = sc.nextInt();
    a = new int[l];
    System.out.println("Enter values into array");
    for (int i = 0; i < l; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();
  }

  void combine(JoinTwoArrays A, JoinTwoArrays B) {
    int pos = 0;
    for (int i = 0; i < A.a.length; i++) {
      res[i] = A.a[i];
      pos = i;
    }
    for (int i = pos; i < B.a.length; i++) {
      res[i] = A.a[i];
    }
  }

  void show() {
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

  public static void main(String[] args) {
    JoinTwoArrays obj1 = new JoinTwoArrays();
    obj1.getData();
    JoinTwoArrays obj2 = new JoinTwoArrays();
    obj2.getData();
    System.out.println("Value entered are");
    obj1.show();
    obj2.show();
  }
}
