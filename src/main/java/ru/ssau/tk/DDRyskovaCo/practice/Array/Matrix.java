package ru.ssau.tk.DDRyskovaCo.practice.Array;

public class Matrix {

    private final double[][] matrix;
    private final int n;
    private final int m;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new double[n][m];
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public double getAt(int n, int m) {
        return matrix[n][m];
    }

    public void setAt(int n, int m, double value) {
        matrix[n][m] = value;
    }
}

