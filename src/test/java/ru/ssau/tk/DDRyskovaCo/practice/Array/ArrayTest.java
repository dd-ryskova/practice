package ru.ssau.tk.DDRyskovaCo.practice.Array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Array.createArray;

public class ArrayTest {

    int[] firstArray = createArray(14);
    int[] secondArray = createArray(5);
    int[] thirdArray = createArray(0);

    @Test
    public void testCreateArray() {
        assertEquals(firstArray.length, 14);
        assertEquals(secondArray.length, 5);
        assertEquals(thirdArray.length, 0);
    }
}