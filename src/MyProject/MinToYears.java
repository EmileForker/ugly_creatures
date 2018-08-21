package MyProject;

public class MinToYears {

    private static final String ERROR_MESSAGE = "Invalid value!";

    public static void main(String[] args) {
        printEqual(-1,-1,-1);
    }

    public static void printEqual(int a, int b, int c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            System.out.println(ERROR_MESSAGE);
        }

        if ((a == b & a > 0) & (a == c & b > 0) & (b == c & c >0)) {
            System.out.println("All numbers are equal");
        }

        if ((a != b) & (a != c) & (b != c)) {
            System.out.println("All numbers are different");
        }

        if (((a == b & a !=c & a > 0 & b > 0 & c >0 ) || (a == c) & (a != b) & a >0 & b > 0 & c > 0 ) || (b == c) & (b != a) & a >0 & b >0 & c >0) {
            System.out.println("Neither all are equal of different");
        }
    }
}