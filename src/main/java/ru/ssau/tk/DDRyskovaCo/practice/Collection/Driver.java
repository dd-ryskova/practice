package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import ru.ssau.tk.DDRyskovaCo.practice.DataType.Gender;

import java.util.Date;
import java.util.Objects;

public final class Driver {

    private int id;
    private String name;
    private Gender gender;
    private Date licenseExpirationDate;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setLicenseExpirationDate(Date licenseExpirationDate) {
        this.licenseExpirationDate = licenseExpirationDate;
    }

    public Date getLicenseExpirationDate() {
        return licenseExpirationDate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Driver driver = (Driver) object;
        return id == driver.id && Objects.equals(name, driver.name) && gender == driver.gender && Objects.equals(licenseExpirationDate, driver.licenseExpirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, licenseExpirationDate);
    }

    @Override
    public String toString() {
        return "Водитель" + "\nИдентификатор: " + id + "\nИмя: " + name + "\nГендер: " + gender + "\nСрок окончания действия лицензии: " + licenseExpirationDate + '\n';
    }
}
