import java.util.Scanner;

public class tsk3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();
        System.out.println("enter operator +,-,*,/");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);

                break;
            case '-':
                System.out.println(num1 - num2);

                break;
            case '*':
                System.out.println(num1 * num2);

                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("cannot divide by zero");

                }

                break;

            default:
                System.out.println("invalid");
                break;
        }
        sc.close();
    }

}
