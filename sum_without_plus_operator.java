public class sum_without_plus_operator {
    public static void main(String[] args) {
        int a = 5; // Example number 1
        int b = 3; // Example number 2

        // Calculate the sum using bitwise operations
        System.out.print("The sum of " + a + " and " + b + " is: "); // This line is just for reference
        while (b != 0) {
            a++;
            b--;
        }

        System.out.println(a);
    }

}
