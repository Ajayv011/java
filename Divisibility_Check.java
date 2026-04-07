import java.util.Scanner;

public class Divisibility_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number in range you want to check :");
        int var1 = sc.nextInt();
        int n = var1;
        System.out.print("is divisible by 2:");
        for (var1 = 1; var1 <= n; var1++) {
            if (var1 % 2 == 0) {
                System.out.println(var1 + ",");
            }
        }
        System.out.print("is divisible by 3:");
        for (var1 = 1; var1 <= n; var1++) {
            if (var1 % 3 == 0) {
                System.out.println(var1 + ",");
            }
        }
        System.out.print("is divisible by 6:");
        for (var1 = 1; var1 <= n; var1++) {
            if (var1 % 6 == 0) {
                System.out.println(var1 + ",");
            }
        }
        System.out.print("is divisible by 2, 3 & 6:");
        for (var1 = 1; var1 <= n; var1++) {
            if (var1 % 2 == 0 && var1 % 3 == 0 && var1 % 6 == 0) {
                System.out.println(var1 + ",");
            }
        }
        sc.close();
    }
}
