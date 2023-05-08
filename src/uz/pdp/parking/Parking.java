package uz.pdp.parking;

import java.util.Arrays;

public class Parking {
    private String name;
    private Row[] rows;

    public Parking() {
    }

    public Parking(String name, Row[] rows) {
        this.name = name;
        this.rows = rows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Row[] getRows() {
        return rows;
    }

    public void setRows(Row[] rows) {
        this.rows = rows;
    }


    @Override
    public String toString() {
        return "Parking{" +
                "name='" + name + '\'' +
                ", rows=" + Arrays.toString(rows) +
                '}';
    }
}
