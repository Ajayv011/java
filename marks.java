import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
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
        double var8 = var7 / 5;

        System.out.println("The total obtain marks is " + var7);
        System.out.println("percentage is: " + var8 + "%");
        System.out.println("grade is: " + (var8 >= 90 ? "A+"
                : (var8 >= 80 ? "A"
                        : (var8 >= 70 ? "B+" : (var8 >= 60 ? "B" : (var8 >= 50 ? "C+" : (var8 >= 40 ? "C" : "F")))))));
        System.out.println("remarks is: " + (var8 >= 90 ? "excellent"
                : (var8 >= 80 ? "very good"
                        : (var8 >= 70 ? "good" : (var8 >= 60 ? "average" : (var8 >= 50 ? "below average" : (var8 >= 40 ? "poor" : "fail")))))));
        var1.close();
    }

}
