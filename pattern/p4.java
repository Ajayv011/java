package pattern;

public class p4 {
    public static void main(String[] args) {
        // flyods reverse triangle
        int n = 6;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

}
