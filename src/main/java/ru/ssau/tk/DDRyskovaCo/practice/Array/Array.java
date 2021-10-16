package ru.ssau.tk.DDRyskovaCo.practice.Array;

public class Array {

    public static int[] createArray(int size) {
        return new int[size];
    }

    public static int[] createFilledArray(int size) {
        int[] array = new int[size];
        array[0] = 2;
        array[size - 1] = 2;
        for (int i = 1; i < size - 1; ++i) {
            array[i] = 1;
        }
        return array;
    }

    public static int[] createOddFilledArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = 2 * i + 1;
        }
        return array;
    }

    public static int[] createEvenFilledArray(int size) {
        int[] array = new int[size];
        for (int i = size - 1; i >= 0; --i) {
            array[i] = (size - i) * 2;
        }
        return array;
    }

    public static int[] createFibonacciFilledArray(int size) {
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < size; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static int[] createSqrArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = i * i;
        }
        return array;
    }
}
