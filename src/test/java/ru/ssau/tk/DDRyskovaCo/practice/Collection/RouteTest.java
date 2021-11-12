package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.*;

public class RouteTest {

    Location firstLocation = new Location();
    Location secondLocation = new Location();

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
}