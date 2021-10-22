package ru.ssau.tk.DDRyskovaCo.practice.String.Tasks10;

public class ClassForTasks {

    public static void printChar(String s) {
        for (int i = 0; i < s.length(); ++i) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void printBytes(String s) {
        byte[] array = s.getBytes();
        for (byte v : array) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
