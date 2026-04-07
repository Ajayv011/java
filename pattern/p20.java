package pattern;

public class p20 {
  public static void main(String[] args) {
    int n = 3; // Size of the butterfly
    // Upper part of the butterfly
    for (int i = 0; i <= n; i++) {
      // Print stars on the left wing
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      for (int k = 0; k < 2 * (n - i); k++) {
        System.out.print(" ");
      }
      // Print stars on the right wing
      for (int j2 = 0; j2 <= i; j2++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = n; i >= 0; i--) {
      // Print stars on the left wing
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      for (int k = 0; k < 2 * (n - i); k++) {
        System.out.print(" ");
      }
      // Print stars on the right wing
      for (int j2 = 0; j2 <= i; j2++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
