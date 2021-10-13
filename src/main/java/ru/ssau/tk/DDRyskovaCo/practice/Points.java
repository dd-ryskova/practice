package ru.ssau.tk.DDRyskovaCo.practice;

public class Points {

    private final static double DELTA = 0.00005;

    private Points() {
    }

    public static Point sum(Point first, Point second) {
        return new Point(first.getX() + second.getX(), first.getY() + second.getY(), first.getZ() + second.getZ());
    }

    public static Point subtract(Point first, Point second) {
        return new Point(first.getX() - second.getX(), first.getY() - second.getY(), first.getZ() - second.getZ());
    }

    public static Point multiply(Point first, Point second) {
        return new Point(first.getX() * second.getX(), first.getY() * second.getY(), first.getZ() * second.getZ());
    }

    public static Point divide(Point first, Point second) {
        return new Point(first.getX() / second.getX(), first.getY() / second.getY(), first.getZ() / second.getZ());
    }

    public static Point enlarge(Point first, double x) {
        return new Point(first.getX() * x, first.getY() * x, first.getZ() * x);
    }

    public static double length(Point first) {
        return first.length();
    }

    public static Point opposite(Point first) {
        return new Point(-first.getX(), -first.getY(), -first.getZ());
    }

    public static Point inverse(Point first) {
        return new Point(1 / first.getX(), 1 / first.getY(), 1 / first.getZ());
    }

    public static double scalarProduct(Point first, Point second) {
        return first.getX() * second.getX() + first.getY() * second.getY() + first.getZ() * second.getZ();
    }

    public static Point vectorProduct(Point first, Point second) {
        return new Point((first.y * second.z - first.z * second.y), (first.z * second.x - first.x * second.z), (first.x * second.y - first.y * second.x));
    }

    private static boolean equalsApproximately(double first, double second) {
        return Math.abs(first - second) < DELTA;
    }

    public static boolean equalsApproximately(Point first, Point second) {
        return equalsApproximately(first.getX(), second.getX()) && equalsApproximately(first.getY(), second.getY()) && equalsApproximately(first.getZ(), second.getZ());
    }
}
