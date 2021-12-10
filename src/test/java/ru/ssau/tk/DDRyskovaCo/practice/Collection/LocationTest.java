package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

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

    @Test
    public void testCompareTo() {

        Waypoint firstDepot = new Waypoint();
        Waypoint firstWarehouse = new Waypoint();

        Settlement firstVillage = new Settlement();
        Settlement firstCity = new Settlement();

        firstVillage.setLatitude(4.);
        firstCity.setLatitude(180.);
        firstDepot.setLatitude(100.);
        firstWarehouse.setLatitude(120.);

        firstVillage.setLongitude(3.);
        firstCity.setLongitude(6.);
        firstDepot.setLongitude(8.);
        firstWarehouse.setLongitude(5.);


        List<Location> locations = new ArrayList<>(Arrays.asList(firstVillage, firstCity, firstDepot, firstWarehouse));
        assertEquals(locations, new ArrayList<>(Arrays.asList(firstVillage, firstCity, firstDepot, firstWarehouse)));
        assertEquals(Collections.min(locations), firstVillage);
        assertEquals(Collections.max(locations), firstCity);
        Collections.sort(locations);
        assertEquals(locations, new ArrayList<>(Arrays.asList(firstVillage, firstDepot, firstWarehouse, firstCity)));
    }
}
