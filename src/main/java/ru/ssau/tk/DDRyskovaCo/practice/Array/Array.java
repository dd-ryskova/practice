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
        array[0] = 1;
        for (int i = 1; i < size; ++i) {
            array[i] = array[i - 1] + 2;
        }
        return array;
    }
}
