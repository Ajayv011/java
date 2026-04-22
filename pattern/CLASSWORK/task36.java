import java.util.Scanner;

public class task36 {
  public static void main(String[] args) {
    // finding the sum of each row in 2d array
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
    System.out.println("sum of each row in array is");
    for (int i = 0; i < row; i++) {
      int sum = 0;
      for (int j = 0; j < col; j++) {
        sum += arr[i][j];
      }
      System.out.println(sum);
    }
    aj.close();
  }
}
