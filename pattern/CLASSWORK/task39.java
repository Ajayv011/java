import java.util.Scanner;

public class task39 {

  public static void main(String[] args) {
    // sorting 1d array in descending order without inbuilt methods
    Scanner aj = new Scanner(System.in);
    System.out.println("enter array size");
    int row = aj.nextInt();
    int[] arr = new int[row];
    System.out.println("enter array elements");
    for (int i = 0; i < row; i++) {
      arr[i] = aj.nextInt();
    }
    for (int i = 0; i < row - 1; i++) {
      for (int j = 0; j < row - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println("sorted array in ascending order:");
    for (int i = 0; i < row; i++) {
      System.out.print(arr[i] + " ");
    }

  }

}
