package ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks30;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks30.ThirdArray.*;

public class ThirdArrayTest {

    public double[] firstArray = {12., 14., 34., 28.6, 57.2};
    public int[] secondArray = {1, 2, 3, 4, 5, 6};

    @Test
    public void testCreateIndexOfArray() {
        assertEquals(createIndexOfArray(firstArray, 28.6), 3);
        assertEquals(createIndexOfArray(firstArray, 14.), 1);
    }

    @Test
    public void testCreateReverseMaxAndMinArray() {
        createReverseMaxAndMinArray(firstArray);
        assertEquals(firstArray, new double[]{57.2, 14., 34., 28.6, 12.});
    }

    @Test
    public void testCreateBitwiseNegationArray() {
        createBitwiseNegationArray(secondArray);
        assertEquals(secondArray, new int[]{-2, -3, -4, -5, -6, -7});
    }
}