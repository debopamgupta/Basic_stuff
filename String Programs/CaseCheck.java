import java.util.Scanner;

class CaseCheck {
  public static void main(String[] args) {
    char c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character");
    c = sc.nextLine().charAt(0);
    sc.close();
    if (Character.isUpperCase(c))
      System.out.println("UpperCase");
    else if (Character.isLowerCase(c))
      System.out.println("LowerCase");
    else
      System.out.println("Wrong input character");
  }

}
