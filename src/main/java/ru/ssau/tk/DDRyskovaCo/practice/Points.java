package ru.ssau.tk.DDRyskovaCo.practice;

public class Points {

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
}
