package ru.ssau.tk.DDRyskovaCo.practice;

public class Person {

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " Passport: " + passportId + " ";
    }

    private String firstName;
    private String lastName;
    private int passportId;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.passportId = 0;
        System.out.println("  First constructor");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = 0;
        System.out.println("  Second constructor");
    }

    public Person(int passportId) {
        this.firstName = "";
        this.lastName = "";
        this.passportId = passportId;
        System.out.println("  Third constructor");
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        System.out.println("  Fourth constructor");
    }


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





