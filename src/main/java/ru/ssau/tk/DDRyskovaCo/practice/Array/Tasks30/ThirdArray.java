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
}
