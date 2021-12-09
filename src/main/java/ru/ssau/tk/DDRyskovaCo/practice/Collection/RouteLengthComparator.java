package ru.ssau.tk.DDRyskovaCo.practice.Collection;

import java.util.*;

public class RouteLengthComparator implements Comparator<Route> {

    Map<Route, Double> routeLengthMap = new HashMap<>();

    @Override
    public int compare(Route firstRoute, Route secondRoute) {
        if (routeLengthMap.get(firstRoute) == null) {
            routeLengthMap.put(firstRoute, firstRoute.length());
        }
        if (routeLengthMap.get(secondRoute) == null) {
            routeLengthMap.put(secondRoute, secondRoute.length());
        }
        return Double.compare(routeLengthMap.get(firstRoute), routeLengthMap.get(secondRoute));
    }
}
