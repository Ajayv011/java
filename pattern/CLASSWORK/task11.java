import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        // divisible by both 3 and 5 in range of user input number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " " + " is divisible by 3");
            }
            if (i % 5 == 0) {
                System.out.println(i + " " + " is divisible by 5");
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " " + " is divisible by both 3 and 5");
                }
            }

        }
        scanner.close();
    }
}
