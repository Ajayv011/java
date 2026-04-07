package pattern;

public class p14 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((n - j + 1) + " ");
            }

            System.out.println();

        }
    }
}
