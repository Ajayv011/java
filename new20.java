public class new20 {
    public static void main(String[] args) {
        // this is for finding the minimum of three numbers
        int a = 10;
        int b = 20;
        int c = 15;
        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("The minimum of " + a + ", " + b + ", and " + c + " is: " + min);
    }

}
