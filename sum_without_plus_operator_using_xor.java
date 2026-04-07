// import java.util.Scanner;

public class sum_without_plus_operator_using_xor {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter the second number: ");
        // int b = sc.nextInt();

        int a = 5; // Example number 1
        int b = 3; // Example number 2

        // Calculate the sum using XOR and AND operations
        while (b != 0) {
            int carry = a & b; // Calculate carry
            a = a ^ b; // Sum of bits where at least one is not set
            b = carry << 1; // Carry is shifted by one so that it can be added in the next iteration
        }

        System.out.println("The sum of " + a + " and " + b + " is: " + a);
    }

}
