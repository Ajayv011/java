package pattern;

public class p10 {
    public static void main(String[] args) {
        // hollow rectangle
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n || j == n || j == 1 || i == 1) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
