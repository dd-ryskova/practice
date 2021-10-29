package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FirstClassForCloneTest {

    @Test
    public void testTestClone() {
        try {
            FirstClassForClone object = new FirstClassForClone(2);
            Object cloneObject = object.clone();
        } catch (CloneNotSupportedException e) {                       //Было поймано исключение, так как нет интерфейса Cloneable
            e.printStackTrace();
        }
    }
}
