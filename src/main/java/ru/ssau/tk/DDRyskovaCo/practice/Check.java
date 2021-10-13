package ru.ssau.tk.DDRyskovaCo.practice;

public class Check {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);                                //Здесь мы получаем 10 из класса checkInt и выводим его
        checkPerson(person);                             //Из класса checkPerson меняем значение person.setFirstName на Oleg и выводим
        System.out.println(number);                      // 5 получаем из данного класса
        System.out.println(person.getFirstName());       //Выводим Oleg, так как поле FirstName было изменено
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getFirstName());
    }
}
