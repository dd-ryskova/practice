package ru.ssau.tk.DDRyskovaCo.practice.String.Tasks10;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.String.Tasks10.ClassForTasks.printChar;

public class ClassForTasksTest {

    @Test
    public void testPrintChar() {
        printChar("This method works!");
    }
}