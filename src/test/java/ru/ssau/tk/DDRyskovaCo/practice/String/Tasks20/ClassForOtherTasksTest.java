package ru.ssau.tk.DDRyskovaCo.practice.String.Tasks20;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.String.Tasks20.ClassForOtherTasks.*;

public class ClassForOtherTasksTest {

    @Test
    public void testCountOfLinesIgnoreTheSpace() {
        assertEquals(countOfLinesIgnoreTheSpace(new String[]{" This method  works!  "}, "This", "works!"), 1);
        assertEquals(countOfLinesIgnoreTheSpace(new String[]{"This method works!"}, "This", "method"), 0);
        assertEquals(countOfLinesIgnoreTheSpace(new String[]{"  This  method works!  ", "  This method works again! ", "This method again   works! "}, "This", "works!"), 2);
    }

    @Test
    public void testReplacementTheString() {
        assertEquals(replacementTheString("ороророро", "оро", "ро"), "роррро");
        assertEquals(replacementTheString("This method works!", "This", "And this"), "And this method works!");
    }

    @Test
    public void testSubstringOfString() {
        assertEquals(substringOfString("This method works!", 5, 19), "method works!");
    }
}