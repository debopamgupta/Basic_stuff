import java.util.Scanner;

class Piglatin {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = sc.next();
    word = word.toUpperCase();
    sc.close();
    boolean flag = false;
    int pos = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O'
          || word.charAt(i) == 'U') {
        pos = i;
        flag = true;
        break;
      }
    }

    if (flag) {
      if (pos == 0) {
        System.out.println("" + word);
      } else if (pos > 0) {
        System.out.println(word.substring(pos) + word.substring(0, pos) + "AY");
      }
    } else {
      System.out.println(word + "Y");
    }
  }
}

// do not use split()
// input a sentence and check whether a particular word is present in the string
// or not.
// eg: i live in kolkata (check kolkata is present or not)

// input a sentence and print the sentence in the following format
// eg input -> i live in kolkata
// output -> kolkata in live i