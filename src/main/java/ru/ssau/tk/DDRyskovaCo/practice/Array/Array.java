package ru.ssau.tk.DDRyskovaCo.practice.Array;

public class Array {

    public static int[] createArray(int size) {
        return new int[size];
    }

    public static int[] createFilledArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = 1;
            array[0] = 2;
            array[size-1] = 2;
        }
        return array;
    }
}
