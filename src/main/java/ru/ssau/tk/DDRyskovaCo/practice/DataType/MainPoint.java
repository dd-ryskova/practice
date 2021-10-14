package ru.ssau.tk.DDRyskovaCo.practice.DataType;

public class MainPoint {

    public static void main(String[] args) {

        Point firstPoint = new Point(12, -29, 52.3);
        Point secondPoint = new Point(452, 13412, 1230);
        Point thirdPoint = new Point(-0.999, 3.87, 12.64);

        System.out.println("Точка с координатами: " + "(" + firstPoint.x + ", " + firstPoint.y + ", " + firstPoint.z + ")");
        System.out.println("Точка с координатами: " + "(" + secondPoint.x + ", " + secondPoint.y + ", " + secondPoint.z + ")");
        System.out.println("Точка с координатами: " + "( " + thirdPoint.x + ", " + thirdPoint.y + ", " + thirdPoint.z + ")");

        System.out.println("Сумма 2 точек: " + Points.sum(firstPoint, secondPoint));
        System.out.println("Разность 2 точек: " + Points.subtract(firstPoint, secondPoint));
        System.out.println("Умножение 2 точек: " + Points.multiply(firstPoint, secondPoint));
        System.out.println("Деление 2 точек: " + Points.divide(firstPoint, secondPoint));
    }
}
