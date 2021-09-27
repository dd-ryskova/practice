package ru.ssau.tk.DDRyskovaCo.practice;

public class Person {

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

    public static void main(String[] args) {
        Person first = new Person();
        first.setFirstName("Jane");
        first.setLastName("Austen");
        first.setPassportId(234567);

        Person second = new Person();
        second.setFirstName("Stephen");
        second.setLastName("King");
        second.setPassportId(456787);

        System.out.println("First human: " + first.getFirstName() + " " + first.getLastName() + "   " + "Passport: " + first.getPassportId());
        System.out.println("Second human: " + second.getFirstName() + " " + second.getLastName() + "   " + "Passport: " + second.getPassportId());
    }
}





