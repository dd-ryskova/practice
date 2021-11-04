package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

import org.testng.annotations.Test;

import static ru.ssau.tk.DDRyskovaCo.practice.Exceptions.CheckedException.throwCheckedException;

public class CheckedExceptionTest {

    @Test
    public void testThrowCheckedException() {
        try {
            throwCheckedException();
        } catch (CheckedException e) {
            e.getCause();
        }
    }
}