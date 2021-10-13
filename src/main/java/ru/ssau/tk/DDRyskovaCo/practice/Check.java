package ru.ssau.tk.DDRyskovaCo.practice;

public class Check {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");                       //Создаём первый объект с именем Arkadiy
        checkAnotherPerson(person);                           //Вызываем метод checkAnotherPerson(person) и выводим имя Ignat
        System.out.println(person.getFirstName());            //Выводим имя Arkadiy
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person();                                //Создаём второй объект с именем Ignat, даже если в качестве параметра принимаем - первый
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }
}
