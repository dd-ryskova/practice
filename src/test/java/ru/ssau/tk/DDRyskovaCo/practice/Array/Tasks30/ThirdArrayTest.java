package ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks30;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks30.ThirdArray.*;

public class ThirdArrayTest {

    public double[] firstArray = {12., 14., 34., 28.6, 57.2};
    public int[] secondArray = {1, 2, 3, 4, 5, 6};
    public int[] thirdArray = {0, 5, 10, 15};
    public int[] fourthArray = {2, 4, 6, 7, 12, 15};
    public int[] fifthArray = {-3, -4, -2, -6, 0};
    public int[][] sixthArray = createTwoDimensionalArray(3);

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

    @Test
    public void testCreateBitwiseNegationArrayTwo() {
        assertEquals(createBitwiseNegationArrayTwo(thirdArray), new int[]{-1, -6, -11, -16});
    }

    @Test
    public void testCreateSumOfPairsArray() {
        int[] oneArray = createSumOfPairsArray(fourthArray);
        int[] twoArray = createSumOfPairsArray(fifthArray);

        assertEquals(oneArray, new int[]{6, 13, 27});
        assertEquals(twoArray, new int[]{-7, -8, 0});
    }

    @Test
    public void testCreateBooleanArray() {
        boolean[] oneArray = createBooleanArray(fourthArray);
        assertEquals(oneArray, new boolean[]{true, true, true, false, true, false});
    }

    @Test
    public void testCreateFillingArray() {
        assertEquals(createFillingArray(5, 3), new double[]{3, 4, 5, 1, 2});
    }

    @Test
    public void testCreateTwoDimensionalArray() {
        assertEquals(sixthArray[0], new int[]{1, 2, 3});
        assertEquals(sixthArray[1], new int[]{4, 5});
        assertEquals(sixthArray[2], new int[]{6});
    }
}