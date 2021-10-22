package ru.ssau.tk.DDRyskovaCo.practice.String.Tasks10;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.String.Tasks10.ClassForTasks.*;

public class ClassForTasksTest {

    @Test
    public void testPrintChar() {
        printChar("C");
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

    @Test
    public void testStudyingScreening() {
        studyingScreening();
    }

    @Test
    public void testIndexOfTheOccurrence() {
        assertEquals(indexOfTheOccurrence("Class", "s"), 3);
        assertEquals(indexOfTheOccurrence("Class", "b"), -1);
    }

    @Test
    public void testFirstIndexOfTheOccurrenceHalf() {
        assertEquals(firstIndexOfTheOccurrenceHalf("Levels", "l"), 4);
        assertEquals(firstIndexOfTheOccurrenceHalf("LevelsLevels", "Levels"), 6);
        assertEquals(firstIndexOfTheOccurrenceHalf("Class", "cl"), -1);
    }

    @Test
    public void testLastIndexOfTheOccurrenceHalf() {
        assertEquals(lastIndexOfTheOccurrenceHalf("Levels", "e"), 1);
        assertEquals(lastIndexOfTheOccurrenceHalf("Levels", "n"), -1);
        assertEquals(lastIndexOfTheOccurrenceHalf("Class", "Cl"), 0);
        assertEquals(lastIndexOfTheOccurrenceHalf("LevelsLevels", "ls"), 4);
    }
}