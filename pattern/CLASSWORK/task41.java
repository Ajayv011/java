import java.util.Scanner;

class calculator {
  int a, b;

  int sum(int a, int b) {

    return a + b;
  }

  void sub() {
    int c = a - b;
    System.out.println("subtraction of " + a + " and " + b + " is " + c);
  }

  void mul() {
    int c = a * b;
    System.out.println("multiplication of " + a + " and " + b + " is " + c);
  }

  void div() {
    int c = a / b;
    System.out.println("division of " + a + " and " + b + " is " + c);
  }

  void mod() {
    int c = a % b;
    System.out.println("modulus of " + a + " and " + b + " is " + c);
  }
}

public class task41 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    calculator add = new calculator();
    System.out.print("enter 1st no.");
    int x = sc.nextInt();
    System.out.print("enter 2nd no.");
    int y = sc.nextInt();
    System.out.println("sum is " + add.sum(x, y));
    // add.sub();

    // add.mul();
    // add.div();
    // add.mod();
    sc.close();
  }

}
