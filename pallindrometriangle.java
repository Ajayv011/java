public class pallindrometriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the triangle

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in a palindromic pattern
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }

}
