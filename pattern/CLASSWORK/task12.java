import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        // taking 5 input from user as marks and calculating the average, percentage,
        // grade,results
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        double s1 = scanner.nextDouble();
        System.out.print("Enter marks for subject 2: ");
        double s2 = scanner.nextDouble();
        System.out.print("Enter marks for subject 3: ");
        double s3 = scanner.nextDouble();
        System.out.print("Enter marks for subject 4: ");
        double s4 = scanner.nextDouble();
        System.out.print("Enter marks for subject 5: ");
        double s5 = scanner.nextDouble();
        double average = (s1 + s2 + s3 + s4 + s5) / 5;
        double percentage = (s1 + s2 + s3 + s4 + s5) / 500 * 100;
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
            System.out.println("the student has failed");
        }
        // result
        if (percentage >= 60) {
            System.out.println("pass");
        } else
            System.out.println("fail");
        System.out.println("the average marks is " + average);
        System.out.println("the percentage is " + percentage);
        System.out.println("the grade is " + grade);
        scanner.close();
    }
}
