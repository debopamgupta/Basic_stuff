// TODO: print all 3 digit twin prime numbers

// print all 3 digit prime numbers
// use functions ->
// to check if a num is prime or not -> boolean isPrime(int x)

// two classes -> main class and other class with the isPrime fn

class Check {
  boolean isPrime(int x) {
    for (int i = 2; i <= x - 1; i++) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }
}

public class PrintPrimeNumbers {
  public static void main(String[] args) {

    Check obj = new Check();
    for (int i = 100; i <= 999; i++) {
      if (obj.isPrime(i)) {
        System.out.println(i);
      }
    }

  }
}