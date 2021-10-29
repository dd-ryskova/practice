package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

public class SecondClassForClone implements Cloneable {

    public int x;

    public SecondClassForClone(int x) {
        this.x = x;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
