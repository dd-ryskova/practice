package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LocationTest {

    Settlement city = new Settlement();
    Settlement village = new Settlement();
    Waypoint depot = new Waypoint();
    Waypoint warehouse = new Waypoint();

    @Test
    public void testEquals() {

        city.setId(0);
        village.setId(0);
        depot.setId(1);
        warehouse.setId(1);

        assertEquals(warehouse, depot);
        assertEquals(village, city);

        assertNotEquals(village, warehouse);
        assertNotEquals(depot, village);
        assertNotEquals(depot, city);
        assertNotEquals(city, warehouse);

        village.setId(2);

        assertNotEquals(city, village);
    }
}
