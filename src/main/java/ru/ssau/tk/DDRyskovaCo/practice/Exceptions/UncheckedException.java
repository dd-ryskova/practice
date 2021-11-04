package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

public class UncheckedException extends RuntimeException {

    public UncheckedException(CheckedException a) {
        super(a);
    }
}
