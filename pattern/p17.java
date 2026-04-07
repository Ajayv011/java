package pattern;

public class p17 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            char ch = 'a';
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }

}
