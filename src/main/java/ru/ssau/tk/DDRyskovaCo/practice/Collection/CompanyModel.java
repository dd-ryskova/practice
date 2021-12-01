package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import ru.ssau.tk.DDRyskovaCo.practice.DataType.Gender;

import java.util.*;

public class CompanyModel {

    Collection<Location> allLocations;
    Collection<Route> allRoutes;
    Collection<Driver> allDrivers;
    private int maxId = 0;
    Map<Driver, Route> driverRouteMap;

    public CompanyModel() {
        allLocations = new LinkedHashSet<>();
        allRoutes = new LinkedHashSet<>();
        allDrivers = new LinkedHashSet<>();
        driverRouteMap = new LinkedHashMap<>();
    }

    public Map<Driver, Route> getDriverRouteMap() {
        return driverRouteMap;
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

    public Settlement addSettlement(String name, double latitude, double longitude, Location.SettlementType type, int population) {
        Settlement settlement = new Settlement();
        settlement.setId(++maxId);
        settlement.setName(name);
        settlement.setLatitude(latitude);
        settlement.setLongitude(longitude);
        settlement.setType(type);
        settlement.setSettlement(population);
        allLocations.add(settlement);

        return settlement;
    }

    public Waypoint addWaypoint(String name, double latitude, double longitude, Location.WaypointType type, Settlement settlement) {
        Waypoint waypoint = new Waypoint();
        waypoint.setId(++maxId);
        waypoint.setName(name);
        waypoint.setLatitude(latitude);
        waypoint.setLongitude(longitude);
        waypoint.setType(type);
        waypoint.setSettlement(settlement);
        allLocations.add(waypoint);

        return waypoint;
    }

    public Driver addDriver(String name, Gender gender, Date licenseExpirationDate) {
        Driver driver = new Driver();
        driver.setId(++maxId);
        driver.setName(name);
        driver.setGender(gender);
        driver.setLicenseExpirationDate(licenseExpirationDate);
        allDrivers.add(driver);

        return driver;
    }

    public Route addRoute(List<Location> locations) {
        Route route = new Route();
        for (Location element : locations) {
            route.addLocation(element);
        }
        allRoutes.add(route);

        return route;
    }

    public void assignRoute(Driver driver, Route route) {
        driverRouteMap.put(driver, route);
    }
}
