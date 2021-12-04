package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.Collection.Location.SettlementType.*;
import static ru.ssau.tk.DDRyskovaCo.practice.Collection.Location.WaypointType.*;

public class RouteTest {

    public Location firstLocation = new Location();
    public Location secondLocation = new Location();
    public Location thirdLocation = new Location();

    @Test
    public void testAddLocation() {
        List<Location> locations = new ArrayList<>();
        Route route = new Route();

        assertEquals(route.getLocations(), Collections.EMPTY_LIST);

        route.addLocation(firstLocation);
        locations.add(firstLocation);
        assertEquals(route.getLocations(), locations);

        route.addLocation(secondLocation);
        locations.add(secondLocation);
        assertEquals(route.getLocations(), locations);
    }

    @Test
    public void testAddLocationByIndex() {
        List<Location> locations = new ArrayList<>();
        Route route = new Route();

        route.addLocationByIndex(0, firstLocation);
        locations.add(firstLocation);
        assertEquals(route.getLocations(), locations);

        route.addLocationByIndex(1, secondLocation);
        locations.add(secondLocation);
        assertEquals(route.getLocations(), locations);
    }

    @Test
    public void testRemoveLocation() {
        List<Location> locations = new ArrayList<>();
        Route route = new Route();

        route.addLocation(firstLocation);
        route.addLocation(secondLocation);

        locations.add(firstLocation);
        locations.add(secondLocation);

        locations.remove(1);
        route.removeLocation(1);
        assertEquals(route.getLocations(), locations);

        locations.remove(0);
        route.removeLocation(0);
        assertEquals(route.getLocations(), locations);
    }

    @Test
    public void testIterator() {
        Route route = new Route();
        int count = 0;

        route.addLocation(firstLocation);
        route.addLocation(secondLocation);

        firstLocation.setId(0);
        secondLocation.setId(1);

        for (Location locations : route) {
            assertEquals(locations.getId(), count++);
        }

        assertEquals(count, 2);

        assertEquals(route.getFirstLocation(), firstLocation);
        assertEquals(route.getLastLocation(), secondLocation);
    }

    @Test
    public void testRemove() {
        List<Location> locations = new ArrayList<>();
        Route route = new Route();

        locations.add(firstLocation);
        locations.add(secondLocation);
        locations.add(thirdLocation);

        route.addLocationByIndex(0, firstLocation);
        route.addLocationByIndex(1, secondLocation);
        route.addLocationByIndex(2, thirdLocation);

        route.remove(thirdLocation);
        locations.remove(thirdLocation);

        assertEquals(route.getLocations(), locations);
    }

    @Test
    public void testTestEquals() {
        Route firstRoute = new Route();
        Route secondRoute = new Route();

        firstRoute.addLocation(firstLocation);
        firstRoute.addLocation(secondLocation);
        firstRoute.addLocation(thirdLocation);

        secondRoute.addLocation(firstLocation);
        secondRoute.addLocation(secondLocation);
        secondRoute.addLocation(thirdLocation);

        assertEquals(secondRoute, firstRoute);

        firstRoute.removeLocation(0);

        assertNotEquals(secondRoute, firstRoute);
    }

    @Test
    public void testTestToString() {
        Route route = new Route();

        Settlement city = new Settlement();
        city.setType(CITY);
        city.setName("Samara");
        city.setId(123);
        city.setLatitude(45);
        city.setLongitude(90);
        route.addLocation(city);

        Waypoint depot = new Waypoint();
        depot.setType(DEPOT);
        depot.setName("depot");
        depot.setId(456);
        depot.setLatitude(135);
        depot.setLongitude(180);
        route.addLocation(depot);

        System.out.println(route);
    }

    @Test
    public void testLength() {
        Route route = new Route();

        Settlement village = new Settlement();
        Settlement city = new Settlement();

        village.setLatitude(4.);
        city.setLatitude(8.);

        village.setLongitude(3.);
        city.setLongitude(6.);

        route.addLocation(city);
        route.addLocation(village);

        assertEquals(route.length(), 5, 0.0001);
    }
}