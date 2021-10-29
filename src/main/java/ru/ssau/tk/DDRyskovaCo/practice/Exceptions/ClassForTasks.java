package ru.ssau.tk.DDRyskovaCo.practice.Exceptions;

import ru.ssau.tk.DDRyskovaCo.practice.DataType.Person;

public class ClassForTasks {

    public static String dataOutput(Person human) {
        return human.toString();
    }

    public static char[] arrayOfCharactersByIndex(String[] array, int n) {
        char[] newArray = new char[array.length];
        for (int i = 0; i < newArray.length; ++i) {
            newArray[i] = array[i].charAt(n);
        }
        return newArray;
    }

    public static char charactersByIndex(String[] array, int m, int n) {
        return array[m].charAt(n);
    }

    public static int dividingFromStrings(String s1, String s2) {
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        return x / y;
    }
}