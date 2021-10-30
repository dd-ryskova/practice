package ru.ssau.tk.DDRyskovaCo.practice.Array;

import ru.ssau.tk.DDRyskovaCo.practice.Exceptions.IncompatibleDimensionsException;

public class Matrices {

    public static Matrix sumOfMatrices(Matrix first, Matrix second) {
        if (first.getN() != second.getN() || first.getM() != second.getM()) {
            throw new IncompatibleDimensionsException();
        }
        Matrix sum = new Matrix(first.getN(), second.getM());
        for (int i = 0; i < sum.getN(); ++i) {
            for (int j = 0; j < sum.getM(); ++j) {
                double value = first.getAt(i, j) + second.getAt(i, j);
                sum.setAt(i, j, value);
            }
        }
        return sum;
    }

    public static Matrix multiplicationOfMatrices(Matrix first, Matrix second) {
        if (first.getM() != second.getN()) {
            throw new IncompatibleDimensionsException();
        }
        Matrix multiplication = new Matrix(first.getN(), second.getM());
        for (int i = 0; i < multiplication.getN(); ++i) {
            for (int j = 0; j < multiplication.getM(); ++j) {
                double value = 0;
                for (int k = 0; k < first.getM(); ++k) {
                    value += first.getAt(i, k) * second.getAt(k, j);
                    multiplication.setAt(i, j, value);
                }
            }
        }
        return multiplication;
    }

    public static Matrix multiplicationByNumber(Matrix matrix, double number) {
        Matrix multiplicationByNumber = new Matrix(matrix.getN(), matrix.getM());
        for (int i = 0; i < multiplicationByNumber.getN(); ++i) {
            for (int j = 0; j < multiplicationByNumber.getM(); ++j) {
                double value = matrix.getAt(i, j) * number;
                multiplicationByNumber.setAt(i, j, value);
            }
        }
        return multiplicationByNumber;
    }
}
