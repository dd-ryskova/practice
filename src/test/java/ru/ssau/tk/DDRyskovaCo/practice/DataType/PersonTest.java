package ru.ssau.tk.DDRyskovaCo.practice.DataType;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    Person first = new Person();
    Person second = new Person();
    Person third = new Person();
    Person fourth = new Person("Alexandr", "Orlov", 123478);
    Person fifth = new Person("Darya", "Ryskova");
    Person sixth = new Person(873467);
    Person seventh = new Person();
    Person eighth = new Person("Darya", "Ryskova", 123212, Gender.MALE);


    @Test
    public void testFirstHuman() {
        first.setFirstName("Jane");
        first.setLastName("Austen");
        first.setPassportId(234567);

        assertEquals(first.getFirstName(), "Jane");
        assertEquals(first.getLastName(), "Austen");
        assertEquals(first.getPassportId(), 234567);
    }

    @Test
    public void testSecondHuman() {
        second.setFirstName("Stephen");
        second.setLastName("King");

        assertEquals(second.getFirstName(), "Stephen");
        assertEquals(second.getLastName(), "King");
    }

    @Test
    public void testThirdHuman() {
        third.setPassportId(349812);
        assertEquals(third.getPassportId(), 349812);
    }

    @Test
    public void testOfFirstConstructor() {
        assertEquals(seventh.getFirstName(), "");
        assertEquals(seventh.getLastName(), "");
        assertEquals(seventh.getPassportId(), 0);
    }

    @Test
    public void testOfSecondConstructor() {
        assertEquals(fourth.getFirstName(), "Alexandr");
        assertEquals(fourth.getLastName(), "Orlov");
        assertEquals(fourth.getPassportId(), 123478);
    }

    @Test
    public void testOfThirdConstructor() {
        assertEquals(fifth.getFirstName(), "Darya");
        assertEquals(fifth.getLastName(), "Ryskova");
    }

    @Test
    public void testOfFourthConstructor() {
        assertEquals(sixth.getPassportId(), 873467);
    }

    @Test
    public void testOfFifthConstructor() {
        assertEquals(eighth.getFirstName(), "Darya");
        assertEquals(eighth.getLastName(), "Ryskova");
        assertEquals(eighth.getPassportId(), 123212);
        assertEquals(eighth.getGender(), Gender.MALE);
    }

    @Test
    public void testSetGender() {
        fourth.setGender(Gender.FEMALE);
        assertEquals(fourth.getGender(), Gender.FEMALE);
    }


    @AfterMethod
    void afterMethod() {
        System.out.println("PersonTest checked");
    }
}