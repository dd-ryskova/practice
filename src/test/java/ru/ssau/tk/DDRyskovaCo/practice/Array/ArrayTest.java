package ru.ssau.tk.DDRyskovaCo.practice.Array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Array.*;

public class ArrayTest {

    public int[] firstArray = createArray(14);
    public int[] secondArray = createArray(5);
    public int[] thirdArray = createArray(0);

    public int[] fourthArray = createFilledArray(14);
    public int[] fifthArray = createFilledArray(5);

    public int[] sixthArray = createOddFilledArray(3);
    public int[] seventhArray = createEvenFilledArray(5);

    public int[] eighthArray = createFibonacciFilledArray(14);
    public int[] ninthArray = createSqrArray(20);

    @Test
    public void testCreateArray() {
        assertEquals(firstArray.length, 14);
        assertEquals(secondArray.length, 5);
        assertEquals(thirdArray.length, 0);
    }

    @Test
    public void testCreateFilledArray() {
        assertEquals(fourthArray[0], 2);
        assertEquals(fourthArray[13], 2);
        assertEquals(fourthArray[5], 1);
        assertEquals(fifthArray[0], 2);
        assertEquals(fifthArray[4], 2);
        assertEquals(fifthArray[3], 1);
    }

    @Test
    public void testCreateOddFilledArray() {
        assertEquals(sixthArray[0], 1);
        assertEquals(sixthArray[1], 3);
        assertEquals(sixthArray[2], 5);
    }

    @Test
    public void testCreateEvenFilledArray() {
        assertEquals(seventhArray[0], 10);
        assertEquals(seventhArray[1], 8);
        assertEquals(seventhArray[2], 6);
        assertEquals(seventhArray[3], 4);
        assertEquals(seventhArray[4], 2);
    }

    @Test
    public void testCreateFibonacciFilledArray() {
        assertEquals(eighthArray[3], 2);
        assertEquals(eighthArray[7], 13);
        assertEquals(eighthArray[10], 55);
        assertEquals(eighthArray[12], 144);
        assertEquals(eighthArray[13], 233);
    }

    @Test
    public void testCreateSqrArray() {
        assertEquals(ninthArray[0], 0);
        assertEquals(ninthArray[7], 49);
        assertEquals(ninthArray[10], 100);
        assertEquals(ninthArray[15], 225);
        assertEquals(ninthArray[19], 361);
    }
}