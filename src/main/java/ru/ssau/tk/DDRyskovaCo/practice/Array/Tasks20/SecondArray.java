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

    public static int[] createSymmetricArray(int size) {
        int[] array = new int[size];
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
}
