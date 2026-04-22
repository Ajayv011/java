import java.util.Scanner;

import java.lang.String;

public class task29 {
  public static void main(String[] args) {
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
      System.out.println("array elements are");
      for (int j = 0; j < row; j++) {
        for (int j2 = 0; j2 < col; j2++) {
          System.out.print(arr[j][j2] + " ");
        }
        System.out.println();

      }
      System.out.println("array elements sum are");
      int sum = 0;
      for (int j = 0; j < row; j++) {
        for (int j2 = 0; j2 < col; j2++) {
          sum += arr[j][j2];
        }
        System.out.println(sum);
      }
      System.out.println();

    }
    aj.close();

  }

}
