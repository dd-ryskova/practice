package ru.ssau.tk.DDRyskovaCo.practice.DataType;

import org.testng.annotations.Test;

import static ru.ssau.tk.DDRyskovaCo.practice.DataType.PrintType.printType;

public class PrintTypeTest {

    @Test
    public void testPrintType() {
        printType((byte) 2);
        printType('2');
        printType((short) -2);
        printType(2);
        printType(2L);
        printType(2.0f);
        printType(2.0);
        printType(true);
        printType(null);
        printType("2");
        printType(new Person());
        printType(new Object());
        printType(new Point(1, 2, 3));
        printType(Gender.FEMALE);
    }
}