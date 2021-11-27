package ru.ssau.tk.DDRyskovaCo.practice.Collection;

public class Settlement extends Location {

    private int settlement;
    private SettlementType type;

    public int getSettlement() {
        return settlement;
    }

    public void setSettlement(int settlement) {
        this.settlement = settlement;
    }

    public SettlementType getType() {
        return type;
    }

    public void setType(SettlementType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Тип поселения: " + getType() + "\nНазвание: " + getName() + "\nШирота: " + getLatitude() + "\nДолгота: " + getLongitude() + '\n';
    }
}
