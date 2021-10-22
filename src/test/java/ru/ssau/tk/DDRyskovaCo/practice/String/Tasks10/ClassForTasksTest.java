package ru.ssau.tk.DDRyskovaCo.practice.String.Tasks10;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.String.Tasks10.ClassForTasks.*;

public class ClassForTasksTest {

    @Test
    public void testPrintChar() {
        printChar("This method works!");
    }

    @Test
    public void testPrintBytes() {
        printBytes("This method works!");
    }

    @Test
    public void testStringComparison() {
        stringComparison();
    }

    @Test
    public void testPalindrome() {
        assertTrue(palindrome("level"));
        assertFalse(palindrome("levels"));
    }

    @Test
    public void testStringComparisonIgnoreCase() {
        assertTrue(stringComparisonIgnoreCase("string", "STRING"));
        assertFalse(stringComparisonIgnoreCase("string", null));
        assertFalse(stringComparisonIgnoreCase("string", "STRINGS"));
        assertTrue(stringComparisonIgnoreCase("string", "StRiNg"));
    }
}