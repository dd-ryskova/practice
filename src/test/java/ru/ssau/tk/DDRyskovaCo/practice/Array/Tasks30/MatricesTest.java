package ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks30;

import org.testng.annotations.Test;
import ru.ssau.tk.DDRyskovaCo.practice.Array.Matrix;

import java.util.Objects;

import static org.testng.Assert.assertEquals;

import static ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks30.Matrices.*;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks30.Matrices.multiplicationByNumber;

public class MatricesTest {

    private final double DELTA = 0.0001;

    @Test
    public void testSumOfMatrices() {
        Matrix firstMatrix = new Matrix(3, 2);
        Matrix secondMatrix = new Matrix(3, 2);

        for (int i = 0; i < firstMatrix.getN(); ++i) {
            for (int j = 0; j < firstMatrix.getM(); ++j) {
                firstMatrix.setAt(i, j, 1.0);
            }
        }

        for (int i = 0; i < secondMatrix.getN(); ++i) {
            for (int j = 0; j < secondMatrix.getM(); ++j) {
                secondMatrix.setAt(i, j, 2.0);
            }
        }

        Matrix sum = sumOfMatrices(firstMatrix, secondMatrix);

        for (int i = 0; i < Objects.requireNonNull(sum).getN(); ++i) {
            for (int j = 0; j < sum.getM(); ++j) {
                assertEquals(sum.getAt(i, j), 3.0);
            }
        }
    }

    @Test
    public void testMultiplicationOfMatrices() {
        Matrix firstMatrix = new Matrix(3, 2);
        Matrix secondMatrix = new Matrix(2, 3);

        for (int i = 0; i < firstMatrix.getN(); ++i) {
            for (int j = 0; j < firstMatrix.getM(); ++j) {
                firstMatrix.setAt(i, j, 1.0);
            }
        }

        for (int i = 0; i < secondMatrix.getN(); ++i) {
            for (int j = 0; j < secondMatrix.getM(); ++j) {
                secondMatrix.setAt(i, j, 2.0);
            }
        }

        Matrix multiplication = multiplicationOfMatrices(firstMatrix, secondMatrix);

        for (int i = 0; i < (multiplication != null ? multiplication.getN() : 0); ++i) {
            for (int j = 0; j < multiplication.getM(); ++j) {
                assertEquals(multiplication.getAt(i, j), 4.0, DELTA);
            }
        }
    }

    @Test
    public void testMultiplicationByNumber() {
        Matrix firstMatrix = new Matrix(3, 2);
        double number = 1.2;

        firstMatrix.setAt(0, 0, 1);
        firstMatrix.setAt(0, 1, 2);
        firstMatrix.setAt(1, 0, 3);
        firstMatrix.setAt(1, 1, 4);
        firstMatrix.setAt(2, 0, 5);
        firstMatrix.setAt(2, 1, 6);

        Matrix multiplicationByNumber = multiplicationByNumber(firstMatrix, number);

        assertEquals(multiplicationByNumber.getAt(0, 0), 1.2, DELTA);
        assertEquals(multiplicationByNumber.getAt(0, 1), 2.4, DELTA);
        assertEquals(multiplicationByNumber.getAt(1, 0), 3.6, DELTA);
        assertEquals(multiplicationByNumber.getAt(1, 1), 4.8, DELTA);
        assertEquals(multiplicationByNumber.getAt(2, 0), 6.0, DELTA);
        assertEquals(multiplicationByNumber.getAt(2, 1), 7.2, DELTA);
    }
}