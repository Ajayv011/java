import java.util.Scanner;

public class task27 {

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
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    int secondMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > secondMax && arr[i] < max) {
        secondMax = arr[i];
      }
    }
    int secondMin = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < secondMin && arr[i] > min) {
        secondMin = arr[i];
      }
    }
    System.out.println("second largest of array elements is: " + secondMax);
    System.out.println("second minimum of array elements is: " + secondMin);
    sc.close();
  }
}