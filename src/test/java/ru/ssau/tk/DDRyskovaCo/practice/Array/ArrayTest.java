package ru.ssau.tk.DDRyskovaCo.practice.Array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Array.*;

public class ArrayTest {

    int[] firstArray = createArray(14);
    int[] secondArray = createArray(5);
    int[] thirdArray = createArray(0);

    int[] fourthArray = createFilledArray(14);
    int[] fifthArray = createFilledArray(5);

    int[] sixthArray = createOddFilledArray(3);
    int[] seventhArray = createEvenFilledArray(5);

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
}