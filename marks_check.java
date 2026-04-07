import java.util.Scanner;

public class marks_check {
    public static void main(String[] args) {
        Scanner aj = new Scanner(System.in);
        System.out.println("enter 1st subject marks: ");
        int one = aj.nextInt();
        System.out.println("enter 2nd subject marks: ");
        int two = aj.nextInt();
        System.out.println("enter 3rd subject marks: ");
        int three = aj.nextInt();
        System.out.println("enter 4th subject marks: ");
        int four = aj.nextInt();
        System.out.println("enter 5th subject marks: ");
        int five = aj.nextInt();

        int total = one + two + three + four + five;
        double percentage = total / 5;
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        String result = (percentage >= 60) ? "Pass" : "Fail";
        System.out.println("total marks are :" + " " + total);
        System.out.println("total percentage are :" + " " + percentage + "%");
        System.out.println("your result is :" + " " + result);
        aj.close();

    }

}
