package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.DataType.Gender.MALE;

public class DriverTest {

    Driver firstDriver = new Driver();
    Driver secondDriver = new Driver();

    @Test
    public void testTestEquals() {

        firstDriver.setId(1);
        firstDriver.setName("Ivan Vasiliev");
        firstDriver.setGender(MALE);
        firstDriver.setLicenseExpirationDate(new Date(12345678L));

        secondDriver.setId(1);
        secondDriver.setName("Igor Vasiliev");
        secondDriver.setGender(MALE);
        secondDriver.setLicenseExpirationDate(new Date(12345678L));

        System.out.println(firstDriver);
        System.out.println(secondDriver);

        assertNotEquals(firstDriver, secondDriver);

        secondDriver.setName("Ivan Vasiliev");
        assertEquals(firstDriver, secondDriver);
    }
}