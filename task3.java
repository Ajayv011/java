
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class task3 {
    public task3() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int var2 = var1.nextInt();
        System.out.print("Enter the second number: ");
        int var3 = var1.nextInt();
        System.out.print("Enter the third number: ");
        int var4 = var1.nextInt();
        System.out.print("Enter the fourth number: ");
        int var5 = var1.nextInt();
        System.out.print("Enter the fifth number: ");
        int var6 = var1.nextInt();
        int var7 = var2 + var3 + var4 + var5 + var6;
        int var8 = var7 / 5;
        System.out.println("The average of 5 no. is " + var8);
        var1.close();
    }
}
