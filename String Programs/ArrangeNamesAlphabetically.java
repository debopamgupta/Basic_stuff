/*
create an array containing 5 city names 
arrange the name of the cities in 
1. alphabetical order
2.  reverse alphabetical order
3. acc to length ( irrespective of the lengths being same(if any))
imput ( given )
names -> durgapur, delhi, kolkata, patna, pune

output 
( same line separated by commas) 
delhi, durgapur, kolkata, patna, pune

*/
public class ArrangeNameAlphabetically {
  public static void main(String[] args) {
    int i, j;
    String[] names = { "Delhi", "Durgapur", "Patna", "Kolkata", "Pune" };
    String t;
    System.out.println("Original Names");
    for (i = 0; i < 5; i++) {
      if (i < 4)
        System.out.print(names[i] + ", ");
      else
        System.out.print(names[i]);
    }
    System.out.println("\n\n");

    // Bubble Sort the array normal
    // for (i = 0; i < 5 - 1; i++) {
    // for (j = 0; j < 5 - 1 - i; j++) {
    // if (names[j + 1].compareTo(names[j]) < 0) {
    // t = names[j];
    // names[j] = names[j + 1];
    // names[j + 1] = t;
    // }
    // }
    // }

    // Bubble Sort the array reverse
    // for (i = 0; i < 5 - 1; i++) {
    // for (j = 0; j < 5 - 1 - i; j++) {
    // if (names[j + 1].compareTo(names[j]) > 0) {
    // t = names[j];
    // names[j] = names[j + 1];
    // names[j + 1] = t;
    // }
    // }
    // }

    // by length in ascending order
    for (i = 0; i < 5 - 1; i++) {
      for (j = 0; j < 5 - 1 - i; j++) {
        if (names[j + 1].length() < names[j].length()) {
          t = names[j];
          names[j] = names[j + 1];
          names[j + 1] = t;
        }
      }
    }

    System.out.println("Order in terms of length are");
    for (i = 0; i < 5; i++) {
      if (i < 4)
        System.out.print(names[i] + ", ");
      else
        System.out.print(names[i]);
    }
    System.out.println("\n\n");
  }

}

// compareTo will compare two strings by chars and return the diff of ascii vals
// of mismatching chars , if there are no mis match then it gives the diff of
// the length of the strings by subtracting the length of the param String
// object from the invoking String object and hence the diff can be -ve as well

/*

*/