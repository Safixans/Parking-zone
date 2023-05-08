package uz.pdp.parking;

public class ParkingBuilder {
    static Parking build(String name, int rowCount, int columns){
        Parking parking=new Parking();
        Car car=new Car();
        parking.setName(name);
        Row[] rows=createRows(rowCount, columns);
        parking.setRows(rows);

        //parking.getRows()[2].getSpots()[3].setCar(new Car("Cobolt", "White", "01A777AA", CarType.SEDAN));
        return parking;
    }
    public   static Parking ParkIn(Parking parking,int row,int column,Car car) {
        ///  Parking.ParkIn(parking,row,column,car);
        parking.getRows()[row].getSpots()[column].setCar(car);
        return parking;
    }
    public   static Parking ParkOut(Parking parking,int row,int column) {
        ///  Parking.ParkIn(parking,row,column,car);
        parking.getRows()[row].getSpots()[column].setCar(null);
        return parking;
    }
    private static Row[] createRows(int rowCount, int columns) {
        Row[] rows=new Row[rowCount];
        Row row;
        for (int i = 0; i < rows.length; i++) {
            row=new Row();
            row.setSpots(createSpots(columns));
            rows[i]=row;
        }
        return rows;
    }

    private static Spot[] createSpots(int columns) {
        Spot[] spots=new Spot[columns];
        for (int i = 0; i < spots.length; i++) {
            spots[i]=new Spot();
        }
        return  spots;
    }



}
