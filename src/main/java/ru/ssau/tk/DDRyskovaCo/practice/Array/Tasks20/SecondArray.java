package ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks20;

import static java.lang.Math.pow;

public class SecondArray {

    public static int[] createArrayOfDivisors(int x) {
        int numberOfDivisors = 0;
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                numberOfDivisors++;
            }
        }
        int[] array = new int[numberOfDivisors];
        int j = 0;
        for (int i = 1; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) {
                array[j++] = i;
            }
        }
        return array;
    }

    public static double[] createSymmetricArray(int size) {
        double[] array = new double[size];
        int index;
        if (size % 2 != 0) {
            index = (size / 2) + 1;
        } else {
            index = size / 2;
        }
        for (int i = 1; i <= index; i++) {
            array[i - 1] = i;
            array[size - i] = i;
        }
        return array;
    }

    public static void createReverseArray(double[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = array[i] * (-1);
        }
    }

    public static boolean createCheckingArray(double[] array, double x) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == x) {
                return true;
            }
        }
        return false;
    }
}
