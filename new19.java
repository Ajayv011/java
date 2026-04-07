public class new19 {
    public static void main(String[] args) {
        // this is for finding the maximum of three numbers
        int a = 10;
        int b = 20;
        int c = 15;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
    }

}
