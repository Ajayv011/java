import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner rect = new Scanner(System.in);
        System.out.println("enter first number :");
        int var1 = rect.nextInt();
        System.out.println("enter second number :");
        int var2 = rect.nextInt();
        int var3 = 2 * (var1 + var2);
        int var4 = var1 * var3;
        System.out.println("the perimeter of rectangle is: " + var3);
        System.out.println("the area of rectangle is :" + var4);
        rect.close();

    }

}
