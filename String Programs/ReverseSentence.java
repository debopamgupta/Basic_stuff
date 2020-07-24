import java.util.Scanner;

/* input a sentence and print the sentence in the following format
 eg input -> i live in kolkata
 output -> kolkata in live i
*/

public class ReverseSentence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String sent = sc.nextLine();
    sent += " ";
    sc.close();
    String word = "";
    String rev = "";

    for (int i = 0; i < sent.length(); i++) {
      if (sent.charAt(i) != ' ') {
        word += sent.charAt(i);
      } else {
        rev = word + " " + rev;
        word = "";
      }
    }

    System.out.println(rev);
  }
}