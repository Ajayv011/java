public class mirror {
    public static void main(String[] args) {
        int n = 5; // Size of the mirror

        // Upper part of the mirror
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Lower part of the mirror
        for (int i = n - 2; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
