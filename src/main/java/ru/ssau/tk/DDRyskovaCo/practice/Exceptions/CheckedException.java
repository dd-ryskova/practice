package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

public class CheckedException extends Exception {

    public static void throwCheckedException() throws CheckedException {
        throw new CheckedException();
    }

    public static CheckedException throwUncheckedException() {
        try {
            throwCheckedException();
        } catch (CheckedException e) {
            throw new UncheckedException(e);
        }
        return null;
    }
}

