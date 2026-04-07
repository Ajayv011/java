import java.util.Scanner;

public class task31 {
  public static void main(String[] args) {
    // sorting an array in ascending orderwithout using sort method
    Scanner aj = new Scanner(System.in);
    System.out.println("enter row size");
    int row = aj.nextInt();
    System.out.println("enter col size");
    int col = aj.nextInt();
    int[][] arr = new int[row][col];
    System.out.println("enter array elements");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        arr[i][j] = aj.nextInt();
      }
    }
    // sorting the array in ascending order
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col - 1; j++) {
        if (arr[i][j] > arr[i][j + 1]) {
          int temp = arr[i][j];
          arr[i][j] = arr[i][j + 1];
          arr[i][j + 1] = temp;
        }
      }
    }
    // printing the sorted array
    System.out.println("sorted array:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
