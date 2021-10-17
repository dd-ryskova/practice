package ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks20;

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
}
