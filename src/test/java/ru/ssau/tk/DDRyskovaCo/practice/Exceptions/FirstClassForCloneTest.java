package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

import org.testng.annotations.Test;

public class FirstClassForCloneTest {

    @Test
    public void testTestClone() {
        try {
            FirstClassForClone object = new FirstClassForClone(2);
            FirstClassForClone cloneObject = object.clone();
        } catch (CloneNotSupportedException e) {                       //Было поймано исключение, так как нет интерфейса Cloneable
            e.printStackTrace();
        }
    }
}
