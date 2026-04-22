import java.util.Scanner;

public class task26 {
  public static void main(String[] args) {
    // Write a program to input and display reverse of elements of an array
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter " + n + " elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("array elements in reverse order are:");
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
