import java.util.Scanner;

class calculator {
  int x, y;

  calculator() {
    System.out.println(" hello bhai");
  }

  calculator(int a, int b) {
    // this.a = a;
    // this.b = b;
    x = a;
    y = b;

    // System.out.println("sum of " + x + " and " + y + " is " + c);
  }

  void sub() {
    int c = x - y;
    System.out.println("subtraction of " + x + " and " + y + " is " + c);
  }

  void mul() {
    int c = x * y;
    System.out.println("multiplication of " + c + " and " + y + " is " + c);
  }

  void div() {
    int c = x / y;
    System.out.println("division of " + c + " and " + y + " is " + c);
  }

  void mod() {
    int c = x % y;
    System.out.println("modulus of " + c + " and " + y + " is " + c);

  }

  public class task42 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      calculator add = new calculator();
      System.out.print("enter 1st no.");
      int a = sc.nextInt();
      System.out.print("enter 2nd no.");
      int b = sc.nextInt();
      add.sum(a, b);
      add.sub();

      add.mul();
      add.div();
      add.mod();
      sc.close();
    }
  }
}