import java.util.Scanner;

public class task25 {
  public static void main(String[] args) {
    // Write a program to input and display bubble sort of elements of an array
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter" + n + "elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    // bubble sort
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println("array elements after bubble sort are:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
