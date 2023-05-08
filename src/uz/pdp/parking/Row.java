package uz.pdp.parking;

import java.util.Arrays;

public class Row {
    {
        number=""+counter;
        counter++;
    }
    private static int counter=0;
    private String number;
    private Spot[] spots;

    public Row() {
    }

    public Row(String number, Spot[] spots) {
        this.number = number;
        this.spots = spots;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Spot[] getSpots() {
        return spots;
    }

    public void setSpots(Spot[] spots) {
        this.spots = spots;
    }

    @Override
    public String toString() {
        return "Row{" +
                "number='" + number + '\'' +
                ", spots=" + Arrays.toString(spots) +
                '}';
    }
}
