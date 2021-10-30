package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SecondClassForCloneTest {

    @Test
    public void testTestClone() {
        try {
            SecondClassForClone object = new SecondClassForClone(1);
            SecondClassForClone cloneObject = object.clone();
            System.out.println("Object:" + object);
            System.out.println("Clone object:" + cloneObject);
            assertEquals(cloneObject.x, object.x);
        } catch (CloneNotSupportedException e) {                           //Исключение не было выброшено
            e.printStackTrace();
        }
    }
}