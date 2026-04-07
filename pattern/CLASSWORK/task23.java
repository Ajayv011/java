import java.util.Scanner;

public class task23 {
  public static void main(String[] args) {
    // Write a program to input and display average and more of elements of an array
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter" + n + "elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    int sub = 0;
    for (int i = arr.length; i >= 0; i--) {
      sub -= arr[i];
    }
    double average = (double) sum / arr.length;
    int mul = 1;
    for (int i = 0; i < arr.length; i++) {
      mul *= arr[i];
    }
    double div = 1;
    for (int i = 0; i < arr.length; i++) {
      div /= arr[i];
    }
    System.out.println("sum of array elements is: " + sum);
    System.out.println("sub of array elements is: " + sub);
    System.out.println("average of array elements is: " + average);
    System.out.println("multiplication of array elements is: " + mul);
    System.out.println("division of array elements is: " + div);
  }
}
