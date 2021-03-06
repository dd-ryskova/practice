package ru.ssau.tk.DDRyskovaCo.practice.String.Tasks20;

import org.testng.annotations.Test;
import ru.ssau.tk.DDRyskovaCo.practice.DataType.NamedPoint;
import ru.ssau.tk.DDRyskovaCo.practice.DataType.Person;
import ru.ssau.tk.DDRyskovaCo.practice.DataType.Point;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.charset.StandardCharsets.UTF_16;

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

    @Test
    public void testSplittingTheString() {
        assertEquals(splittingTheString("This method works!"), new String[]{"This", "Method", "Works!"});
    }

    @Test
    public void testCreateOneString() {
        assertEquals(createOneString(new String[]{"This", "method", "works!"}), "This, method, works!");
    }

    @Test
    public void testCreateObject() {
        assertEquals(createObject("This works!"), "01s8r6w4s2h0");
    }

    @Test
    public void testFormTheString() {
        assertEquals(formTheString(10), "0 1 2 3 4 5 6 7 8 9 ");
        System.out.println(formTheString(10000));
    }

    public static void main(String[] args) {
        System.out.println(java.nio.charset.Charset.defaultCharset());
    }

    @Test
    public void testChangingTheEncoding() {
        System.out.println(changingTheEncoding("This method works!", UTF_8, UTF_16));
    }
}