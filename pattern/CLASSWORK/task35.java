import java.util.Scanner;

public class task35 {
  public static void main(String[] args) {
    // finding the average of elements in 2d array
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
    int sum = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sum += arr[i][j];
      }
    }
    double average = (double) sum / (row * col);
    System.out.println("average of elements in array is " + average);
    aj.close();
  }

}
