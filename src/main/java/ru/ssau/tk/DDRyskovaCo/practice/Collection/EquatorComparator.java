package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import java.util.Comparator;

public class EquatorComparator implements Comparator<Location> {

    @Override
    public int compare(Location firstLocation, Location secondLocation) {
        return Double.compare(Math.abs(firstLocation.getLatitude()), Math.abs(secondLocation.getLatitude()));
    }
}