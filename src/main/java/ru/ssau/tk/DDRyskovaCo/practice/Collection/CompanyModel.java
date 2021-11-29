package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import java.util.Collection;
import java.util.LinkedHashSet;

public class CompanyModel {

    Collection<Location> allLocations;
    Collection<Route> allRoutes;
    Collection<Driver> allDrivers;

    public CompanyModel() {
        allLocations = new LinkedHashSet<>();
        allRoutes = new LinkedHashSet<>();
        allDrivers = new LinkedHashSet<>();
    }

    public Collection<Location> getAllLocations() {
        return allLocations;
    }

    public Collection<Route> getAllRoutes() {
        return allRoutes;
    }

    public Collection<Driver> getAllDrivers() {
        return allDrivers;
    }
}
