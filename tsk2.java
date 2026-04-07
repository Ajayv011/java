import java.util.Scanner;
import java.lang.*;

public class tsk2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter color");
        String color = sc.nextLine();
        switch (color) {
            case "red":
                System.out.println("stop");

                break;
            case "yellow":
                System.out.println("get ready");

                break;
            case "green":
                System.out.println("go");

                break;

            default:
                System.out.println("invalid");
                break;
        }
        sc.close();
    }
}