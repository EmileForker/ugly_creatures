package ProjectX;

public class AreaCalculator {

    private static final int INVALID_INPUT = -1;
    private static final double PI = 3.14159;

    public static void main(String[] args) {
        System.out.println(area(-8));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_INPUT;
        }
        double area = radius * radius * PI;
        return area;
    }

    private static double area(double x, double y) {
        if ((x < 0) || (x < 0)) {
            return INVALID_INPUT;
        }
        double area = x * y;
        return area;
    }
}




