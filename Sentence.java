import java.util.Scanner;

/*input a sent and find out the longest word and length of the longest word of that sentence.
// input i live in kolkata
// sample output -> kolkata
*/
class Sentence {
  public static void main(String[] args) {
    System.out.println("Enter a sentence");
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    sc.close();
    String w = "";
    String max = "";
    int maxlen = 0;

    sentence += " ";

    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i) != ' ') {
        w += sentence.charAt(i);
      }

      else {
        if (maxlen < w.length()) {
          maxlen = w.length();
          max = w;
        }
        w = "";
      }
    }

    System.out.println("Longest word is " + max);
    System.out.println("Length is " + maxlen);

  }
}