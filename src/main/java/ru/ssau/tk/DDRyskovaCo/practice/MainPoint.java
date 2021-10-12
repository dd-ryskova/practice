package ru.ssau.tk.DDRyskovaCo.practice;

public class MainPoint {
    public static void main(String[] args) {
        Point firstPoint = new Point(12, -29, 52.3);
        Point secondPoint = new Point(452, 13412, 1230);
        Point thirdPoint = new Point(-0.999, 3.87, 12.64);
        System.out.println("Точка с координатами: " + "(" + firstPoint.x + ", " + firstPoint.y + ", " + firstPoint.z + ")");
        System.out.println("Точка с координатами: " + "(" + secondPoint.x + ", " + secondPoint.y + ", " + secondPoint.z + ")");
        System.out.println("Точка с координатами: " + "( " + thirdPoint.x + ", " + thirdPoint.y + ", " + thirdPoint.z + ")");
    }
}
