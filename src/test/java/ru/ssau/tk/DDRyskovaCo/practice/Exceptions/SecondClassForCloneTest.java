package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SecondClassForCloneTest {

    @Test
    public void testTestClone() {
        try {
            SecondClassForClone object = new SecondClassForClone(3);
            Object cloneObject = object.clone();
        } catch (CloneNotSupportedException e) {                           //Исключение не было выброшено
            e.printStackTrace();
        }
    }
}