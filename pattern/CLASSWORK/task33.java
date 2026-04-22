import java.util.Scanner;

public class task33 {
  public static void main(String[] args) {
    // finding the largest element in 2d array
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
    int largest = arr[0][0];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (arr[i][j] > largest) {
          largest = arr[i][j];
        }
      }
    }
    System.out.println("largest element in array is " + largest);
    aj.close();
  }
}
