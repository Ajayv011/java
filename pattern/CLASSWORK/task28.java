import java.util.Scanner;
import java.util.Arrays;

public class task28 {

  public static void main(String[] args) {
    // Write a program to input and display second largest of elements of an array
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter " + n + " elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("array elements are:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("enter k to find kth largest element:");
    int k = sc.nextInt();

    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    Arrays.sort(arr);
    // int kthLargest = arr[n - k];

    System.out.println(k + " largest of array elements is: " + arr[n - k]);
  }

}
