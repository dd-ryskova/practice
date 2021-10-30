package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

public class SecondClassForClone implements Cloneable {

    public int x;

    public SecondClassForClone(int x) {
        this.x = x;
    }

    @Override
    public SecondClassForClone clone() throws CloneNotSupportedException {
        return (SecondClassForClone) super.clone();
    }

    @Override
    public String toString() {
        return " " + this.x;
    }
}
