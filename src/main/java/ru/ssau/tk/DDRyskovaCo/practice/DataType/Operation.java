package ru.ssau.tk.DDRyskovaCo.practice.DataType;

abstract class Operation {

    abstract double apply(double number);

    double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}

