package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import ru.ssau.tk.DDRyskovaCo.practice.DataType.Gender;

import java.util.Comparator;

public class DriversComparator implements Comparator<Driver> {

    @Override
    public int compare(Driver firstDriver, Driver secondDriver) {
        if (firstDriver.getGender() != secondDriver.getGender()) {
            if (firstDriver.getGender() == Gender.FEMALE) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return Long.compare(firstDriver.getLicenseExpirationDate().getTime(), secondDriver.getLicenseExpirationDate().getTime());
        }
    }
}