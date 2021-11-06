package ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks20;

import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks20.SecondArray.*;

public class SecondArrayTest {

    private final double DELTA = 0.0001;

    public double[] firstArray = createArrayOfDivisors(45);
    public double[] secondArray = createSymmetricArray(7);
    public double[] thirdArray = createSymmetricArray(8);

    Integer[] fourthArray = {1, 2, 3, null, 5, 6};
    Integer[] fifthArray = {1, 2, 3, 4, 5, 6};

    public double[] sixthArray = {1, 12, 14, 36, 6};
    public double[] seventhArray = {15, 12, 14, 36, 6};

    @Test
    public void testCreateArrayOfDivisors() {
        assertEquals(firstArray.length, 3);
        assertEquals(firstArray[0], 1.);
        assertEquals(firstArray[1], 3.);
        assertEquals(firstArray[2], 5.);
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

    @Test
    public void testCreateCheckingArray() {
        assertTrue(createCheckingArray(secondArray, 2.));
        assertFalse(createCheckingArray(secondArray, 5.));
    }

    @Test
    public void testCreateCheckingNullArray() {
        assertTrue(createCheckingNullArray(fourthArray));
        assertFalse(createCheckingNullArray(fifthArray));
    }

    @Test
    public void testCreateCheckingEvenArray() {
        assertEquals(createCheckingEvenArray(firstArray), 0, DELTA);
        assertEquals(createCheckingEvenArray(secondArray), 3, DELTA);
    }

    @Test
    public void testCreateMaxArray() {
        assertEquals(createMaxArray(firstArray), 5., DELTA);
        assertEquals(createMaxArray(secondArray), 4., DELTA);
    }

    @Test
    public void testCreateSumArray() {
        assertEquals(createSumArray(firstArray), 6., DELTA);
        assertEquals(createSumArray(thirdArray), 10., DELTA);
    }

    @Test
    public void testCreateCheckingDivisorsArray() {
        assertTrue(createCheckingDivisorsArray(sixthArray));
        assertFalse(createCheckingDivisorsArray(seventhArray));
    }

    @Test
    public void testCreateSimpleArray() {
        ArrayList<Integer> primeArray = createPrimeArray(21);
        assertEquals(primeArray.size(), 8);
        assertEquals(primeArray.get(0), 2.0, DELTA);
        assertEquals(primeArray.get(1), 3.0, DELTA);
        assertEquals(primeArray.get(2), 5.0, DELTA);
        assertEquals(primeArray.get(3), 7.0, DELTA);
        assertEquals(primeArray.get(4), 11.0, DELTA);
        assertEquals(primeArray.get(5), 13.0, DELTA);
        assertEquals(primeArray.get(6), 17.0, DELTA);
        assertEquals(primeArray.get(7), 19.0, DELTA);
    }
}