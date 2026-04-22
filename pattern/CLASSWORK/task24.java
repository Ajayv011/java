import java.util.Scanner;

public class task24 {
  public static void main(String[] args) {
    // Write a program to input and display maximum of elements of an array
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter" + n + "elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("maximum of array elements is: " + max);
    System.out.println("minimum of array elements is: " + min);
    sc.close();
  }
}
