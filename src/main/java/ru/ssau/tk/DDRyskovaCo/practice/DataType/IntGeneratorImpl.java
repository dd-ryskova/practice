package ru.ssau.tk.DDRyskovaCo.practice.DataType;

public class IntGeneratorImpl implements IntGenerator {

    public int callNumber = 0;

    @Override
    public int nextInt() {
        return callNumber++;
    }
}
