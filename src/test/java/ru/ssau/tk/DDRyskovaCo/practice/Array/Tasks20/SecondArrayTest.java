package ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks20;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks20.SecondArray.*;


public class SecondArrayTest {

    public int[] firstArray = createArrayOfDivisors(45);
    public double[] secondArray = createSymmetricArray(7);
    public double[] thirdArray = createSymmetricArray(8);

    @Test
    public void testCreateArrayOfDivisors() {
        assertEquals(firstArray.length, 3);
        assertEquals(firstArray[0], 1);
        assertEquals(firstArray[1], 3);
        assertEquals(firstArray[2], 5);
    }

    @Test
    public void testCreateSymmetricArray() {
        double[] oneArray = new double[]{1., 2., 3., 4., 3., 2., 1.};
        assertTrue(Arrays.equals(secondArray, oneArray));

        double[] twoArray = new double[]{1., 2., 3., 4., 4., 3., 2., 1.};
        assertTrue(Arrays.equals(thirdArray, twoArray));
    }

    @Test
    public void testCreateReverseArray() {
        double[] array = {1.8, 2.4, 3.2};
        createReverseArray(array);
        assertTrue(Arrays.equals(array, new double[]{-1.8, -2.4, -3.2}));
    }
}