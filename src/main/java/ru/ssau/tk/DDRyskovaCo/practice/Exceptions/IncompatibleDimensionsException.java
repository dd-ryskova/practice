package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

public class IncompatibleDimensionsException extends RuntimeException {

    public IncompatibleDimensionsException() {
        this("Матрицы несовместимы!");
    }

    public IncompatibleDimensionsException(String message) {
        super(message);
    }
}
