import java.util.Scanner;

public class task30 {
  public static void main(String[] args) {
    // searching for an element in 2d array
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
    System.out.println("enter element to search");
    int element = aj.nextInt();
    boolean found = false;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (arr[i][j] == element) {
          found = true;
          break;
        }
      }
      if (found) {
        break;
      }
    }
    if (found) {
      System.out.println("element found in array");
    } else {
      System.out.println("element not found in array");
    }
    aj.close();
  }

}
