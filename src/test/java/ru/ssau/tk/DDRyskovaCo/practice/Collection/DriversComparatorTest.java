package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import org.testng.annotations.Test;
import ru.ssau.tk.DDRyskovaCo.practice.DataType.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class DriversComparatorTest {

    Driver firstDriver = new Driver();
    Driver secondDriver = new Driver();
    Driver thirdDriver = new Driver();
    Driver fourthDriver = new Driver();

    @Test
    public void testDriversComparator() {

        firstDriver.setGender(Gender.FEMALE);
        secondDriver.setGender(Gender.MALE);
        thirdDriver.setGender(Gender.MALE);
        fourthDriver.setGender(Gender.FEMALE);

        firstDriver.setLicenseExpirationDate((new Date(42345678L)));
        secondDriver.setLicenseExpirationDate((new Date(32345678L)));
        thirdDriver.setLicenseExpirationDate((new Date(22345678L)));
        fourthDriver.setLicenseExpirationDate((new Date(12345678L)));

        System.out.println(firstDriver.getLicenseExpirationDate());
        System.out.println(secondDriver.getLicenseExpirationDate());
        System.out.println(thirdDriver.getLicenseExpirationDate());
        System.out.println(fourthDriver.getLicenseExpirationDate());

        List<Driver> drivers = new ArrayList<>(Arrays.asList(firstDriver, secondDriver, thirdDriver, fourthDriver));
        drivers.sort(new DriversComparator());
        assertEquals(drivers, new ArrayList<>(Arrays.asList(fourthDriver, firstDriver, thirdDriver, secondDriver)));
    }
}