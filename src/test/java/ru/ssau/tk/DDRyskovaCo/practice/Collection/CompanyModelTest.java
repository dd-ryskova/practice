package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import org.testng.annotations.Test;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.DataType.Gender.MALE;

public class CompanyModelTest {

    Collection<Location> allLocations = new LinkedHashSet<>();
    Collection<Route> allRoutes = new LinkedHashSet<>();
    Collection<Driver> allDrivers = new LinkedHashSet<>();

    Location firstLocation = new Location();
    Location secondLocation = new Location();
    Location thirdLocation = new Location();

    Route firstRoute = new Route();
    Route secondRoute = new Route();

    Driver firstDriver = new Driver();
    Driver secondDriver = new Driver();

    CompanyModel companyModel = new CompanyModel();

    @Test
    public void testGetAllLocations() {

        firstLocation.setId(1);
        secondLocation.setId(2);
        thirdLocation.setId(2);

        allLocations.add(firstLocation);
        allLocations.add(secondLocation);
        allLocations.add(thirdLocation);

        assertEquals(allLocations.size(), 2);

        thirdLocation.setId(3);
        allLocations.add(thirdLocation);

        assertEquals(allLocations.size(), 3);
    }

    @Test
    public void testGetAllRoutes() {

        Settlement city = new Settlement();
        Waypoint depot = new Waypoint();

        firstRoute.addLocation(city);
        firstRoute.addLocation(depot);

        secondRoute.addLocation(city);
        secondRoute.addLocation(depot);

        allRoutes.add(firstRoute);
        allRoutes.add(secondRoute);

        assertEquals(allRoutes.size(), 1);

        secondRoute.remove(depot);
        allRoutes.add(secondRoute);

        assertEquals(allRoutes.size(), 2);
    }

    @Test
    public void testGetAllDrivers() {

        firstDriver.setId(1);
        firstDriver.setName("Ivan Vasiliev");
        firstDriver.setGender(MALE);
        firstDriver.setLicenseExpirationDate(new Date(12345678L));

        secondDriver.setId(1);
        secondDriver.setName("Ivan Vasiliev");
        secondDriver.setGender(MALE);
        secondDriver.setLicenseExpirationDate(new Date(12345678L));

        allDrivers.add(firstDriver);
        allDrivers.add(secondDriver);

        assertEquals(allDrivers.size(), 1);

        secondDriver.setName("Igor Ivanov");
        allDrivers.add(secondDriver);

        assertEquals(allDrivers.size(), 2);
    }

    @Test
    public void testAssignRoute() {
        companyModel.assignRoute(firstDriver, firstRoute);
        assertEquals(companyModel.getDriverRouteMap().get(firstDriver), firstRoute);

        companyModel.assignRoute(secondDriver, secondRoute);
        assertEquals(companyModel.getDriverRouteMap().get(firstDriver), secondRoute);
    }
}