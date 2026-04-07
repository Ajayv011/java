import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num b\\w 1 to 7");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("MONDAY");

                break;
            case 2:
                System.out.println("tuesday");

                break;
            case 3:
                System.out.println("wed");

                break;
            case 4:
                System.out.println("thu");

                break;
            case 5:
                System.out.println("fri");

                break;
            case 6:
                System.out.println("sat");

                break;
            case 7:
                System.out.println("sun");

                break;

            default:
                System.out.println("invalid");
                break;
        }
        sc.close();
    }

}
