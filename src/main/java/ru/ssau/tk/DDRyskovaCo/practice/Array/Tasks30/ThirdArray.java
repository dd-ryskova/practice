package ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks30;

public class ThirdArray {

    public static int createIndexOfArray(double[] array, double x) {
        int index = 0;
        for (int i = 0; i < array.length; ++i) {
            if (x == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void createReverseMaxAndMinArray(double[] array) {
        double max = array[0];
        double min = array[0];
        int indexOfMax = 0;
        int indexOfMin = 0;

        for (int i = 0; i < array.length; ++i) {
            if (max < array[i]) {
                max = array[i];
                indexOfMax = i;
            }
        }
        for (int i = 0; i < array.length; ++i) {
            if (min > array[i]) {
                min = array[i];
                indexOfMin = i;
            }
        }
        array[indexOfMax] = min;
        array[indexOfMin] = max;
    }

    public static void createBitwiseNegationArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }
}
