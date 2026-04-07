import java.util.Scanner;

public class userinput_even_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of even numbers you want to print: ");
        int n = sc.nextInt();
        System.out.println("The first " + n + " even numbers are:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
        sc.close();
    }
}