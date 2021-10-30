package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

public class FirstClassForClone {

    public int x;

    public FirstClassForClone(int x) {
        this.x = x;
    }

    @Override
    public FirstClassForClone clone() throws CloneNotSupportedException {
        return (FirstClassForClone) super.clone();
    }
}
