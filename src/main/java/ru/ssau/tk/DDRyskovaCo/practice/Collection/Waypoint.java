package ru.ssau.tk.DDRyskovaCo.practice.Collection;

public class Waypoint extends Location {

    private WaypointType type;
    private Settlement settlement;

    public WaypointType getType() {
        return type;
    }

    public void setType(WaypointType type) {
        this.type = type;
    }

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }
}
