package ru.ssau.tk.DDRyskovaCo.practice.String.Tasks20;

import org.testng.annotations.Test;
import ru.ssau.tk.DDRyskovaCo.practice.DataType.NamedPoint;
import ru.ssau.tk.DDRyskovaCo.practice.DataType.Person;
import ru.ssau.tk.DDRyskovaCo.practice.DataType.Point;

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

    @Test
    public void testDescriptionOfObjects() {
        Person human = new Person("Jane", "Austen", 234567);
        System.out.println(descriptionOfObjects(human));

        Point firstPoint = new Point(12, -29, 52.3);
        System.out.println(descriptionOfObjects(firstPoint));
        
        NamedPoint secondPoint = new NamedPoint(2, 2, 1, "O");
        System.out.println(descriptionOfObjects(secondPoint));
    }
}