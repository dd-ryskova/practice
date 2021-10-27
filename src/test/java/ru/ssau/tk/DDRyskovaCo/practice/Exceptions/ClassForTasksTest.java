package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

import org.testng.annotations.Test;
import ru.ssau.tk.DDRyskovaCo.practice.DataType.Person;

import static org.testng.Assert.assertThrows;
import static ru.ssau.tk.DDRyskovaCo.practice.Exceptions.ClassForTasks.*;

public class ClassForTasksTest {

    @Test
    public void testDataOutput() {
        Person human = new Person("Jane", "Austen", 234567);
        System.out.println(dataOutput(human));

        assertThrows(NullPointerException.class, () -> dataOutput(null));
    }
}