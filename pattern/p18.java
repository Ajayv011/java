package pattern;

public class p18 {
    public static void main(String[] args) {
        // Write a program to pallindrome pattern
        int n = 5; // Size of the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print numbers in decreasing order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
