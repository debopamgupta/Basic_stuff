// do not use split()
// input a sentence and check whether a particular word is present in the string
// or not.
// eg: i live in kolkata (check kolkata is present or not)

import java.util.Scanner;

public class WordPresent {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String str = sc.nextLine();
    System.out.println("Enter a word to be searched");
    System.out.println();
    String word = sc.nextLine();
    String w = "";
    sc.close();
    str += " ";
    boolean flag = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        w += str.charAt(i);
      } else {
        if (w.toLowerCase().compareTo(word.toLowerCase()) == 0) {
          flag = true;
          break;
        }
        w = "";
      }
    }

    if (flag) {
      System.out.println("Word present");
    } else {
      System.out.println("Word not present");
    }
  }
}