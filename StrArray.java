import java.util.Scanner;

public class StrArray {
  public static void main(String[] args) {

    String arr[] = new String[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 words");
    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextLine();
    }
    System.out.println("Enter a character to search words with");
    char c = sc.next().charAt(0);

    sc.close();

    for (int i = 0; i < 5; i++) {
      if (arr[i].charAt(0) == c) {
        System.out.println("" + arr[i]);
      }
    }
  }
}