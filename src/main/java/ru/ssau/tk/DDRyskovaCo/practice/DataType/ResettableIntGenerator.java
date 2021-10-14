package ru.ssau.tk.DDRyskovaCo.practice.DataType;

public class ResettableIntGenerator implements IntGenerator, Resettable {

    public int callNumber = 0;

    @Override
    public int nextInt() {
        return callNumber++;
    }

    @Override
    public void reset() {
        this.callNumber = 0;
    }
}
