package ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks30;

import org.testng.annotations.Test;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static org.testng.Assert.assertEquals;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks30.ThirdArray.*;

public class ThirdArrayTest {

    private static final double DELTA = 0.0001;

    public double[] firstArray = {12., 14., 34., 28.6, 57.2};
    public int[] secondArray = {1, 2, 3, 4, 5, 6};
    public int[] thirdArray = {0, 5, 10, 15};
    public int[] fourthArray = {2, 4, 6, 7, 12, 15};
    public int[] fifthArray = {-3, -4, -2, -6, 0};
    public int[][] sixthArray = createTwoDimensionalArray(3);
    public double[] seventhArray = {-1., 0., -2.2, 9., 7.7};
    public double[] eightArray = {-1., 0., -2.2, 9., NaN};
    public double[] ninthArray = {1.1, -3., NaN, 2., 0., POSITIVE_INFINITY};

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

    @Test
    public void testCreateWithoutNaNArray() {
        createWithoutNaNArray(seventhArray);
        assertEquals(seventhArray, new double[]{-2.2, -1., 0.0, 7.7, 9.});

        createWithoutNaNArray(eightArray);
        assertEquals(eightArray[0], -1.);
        assertEquals(eightArray[1], 0.);
        assertEquals(eightArray[2], -2.2);
        assertEquals(eightArray[3], 9.);
        assertEquals(eightArray[4], NaN);
    }

    @Test
    public void testCreateStringArray() {
        String[] array = new String[]{"This", "method", "works!"};
        createStringArray(array);
    }

    @Test
    public void testCreateMultiplicationArray() {
        assertEquals(createMultiplicationArray(ninthArray), -6.6, DELTA);
    }

    @Test
    public void testCreateToHexStringFromArray() {
        createToHexStringFromArray(thirdArray);
    }
}