public class Main {
  public static void main(String[] args) {
    int[] arrA = { 8, 5, 1, 2 };
    int[] arrB = { 11, 45, 22, 30 };

    int pairs = 0;
    int lastIndex = 0;

    for (int i = 0; i < arrA.length; i++) {
      if (arrA[i] % 2 == 0) {
        pairs++;
      }

    }
  }
}
