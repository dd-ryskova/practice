package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import java.util.*;

public final class Route implements Iterable<Location>, Comparable<Route> {

    private final List<Location> locations = new ArrayList<>();
    private final RouteLengthComparator routeLengthComparator = new RouteLengthComparator();

    public List<Location> getLocations() {
        return locations;
    }

    public void addLocation(Location location) {
        this.locations.add(location);
    }

    public void addLocationByIndex(int index, Location location) {
        this.locations.add(index, location);
    }

    public void removeLocation(int index) {
        this.locations.remove(index);
    }

    public Location getFirstLocation() {
        return locations.get(0);
    }

    public Location getLastLocation() {
        return locations.get(locations.size() - 1);
    }

    @Override
    public Iterator<Location> iterator() {
        return locations.iterator();
    }

    public void remove(Location location) {
        int count = 0;

        for (Location currentLocation : this.locations) {
            if (currentLocation.equals(location)) {
                removeLocation(count);
                return;
            }
            count++;
        }
    }

    public double length() {
        double length = 0;
        for (int i = 1; i < locations.size(); i++) {
            double x1 = locations.get(i - 1).getLatitude();
            double y1 = locations.get(i - 1).getLongitude();
            double x2 = locations.get(i).getLatitude();
            double y2 = locations.get(i).getLongitude();
            length += Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
        return length;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Route route = (Route) object;
        return Objects.equals(locations, route.locations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locations);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Location location : getLocations()) {
            stringBuilder.append(location);
            stringBuilder.append('\n');
        }
        return String.valueOf(stringBuilder);
    }

    @Override
    public int compareTo(Route route) {
        return routeLengthComparator.compare(this, route);
    }
}
