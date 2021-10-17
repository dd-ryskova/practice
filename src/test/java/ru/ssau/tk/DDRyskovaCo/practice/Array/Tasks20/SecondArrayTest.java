package ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks20;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks20.SecondArray.*;


public class SecondArrayTest {

    public int[] firstArray = createArrayOfDivisors(45);
    public int[] secondArray = createSymmetricArray(7);
    public int[] thirdArray = createSymmetricArray(8);

    @Test
    public void testCreateArrayOfDivisors() {
        assertEquals(firstArray.length, 3);
        assertEquals(firstArray[0], 1);
        assertEquals(firstArray[1], 3);
        assertEquals(firstArray[2], 5);
    }

    @Test
    public void testCreateSymmetricArray() {
        int[] oneArray = new int[]{1, 2, 3, 4, 3, 2, 1};
        assertTrue(Arrays.equals(secondArray, oneArray));

        int[] twoArray = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        assertTrue(Arrays.equals(thirdArray, twoArray));
    }
}