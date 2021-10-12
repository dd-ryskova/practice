package ru.ssau.tk.DDRyskovaCo.practice;

public class MainPerson {
    public static void main(String[] args) {
        Person first = new Person("Jane", "Austen", 234567);
        Person second = new Person("Stephen", "King");
        Person third = new Person(349812);
        Person fourth = new Person("Dale", "Carnegie", 123457);
        Person fifth = new Person();

        System.out.println();
        System.out.println("First human: " + first);
        System.out.println("Second human: " + second);
        System.out.println("Third human: " + third);
        System.out.println("Fourth human: " + fourth);
        System.out.println("Fifth human: " + fifth);
    }
}
