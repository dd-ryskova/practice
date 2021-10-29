package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

public class FirstClassForClone {

    public int x;

    public FirstClassForClone(int x) {
        this.x = x;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
