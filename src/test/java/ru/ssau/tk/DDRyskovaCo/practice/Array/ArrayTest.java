package ru.ssau.tk.DDRyskovaCo.practice.Array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Array.createArray;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Array.createFilledArray;

public class ArrayTest {

    int[] firstArray = createArray(14);
    int[] secondArray = createArray(5);
    int[] thirdArray = createArray(0);

    int[] fourthArray = createFilledArray(14);
    int[] fifthArray = createFilledArray(5);

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
}