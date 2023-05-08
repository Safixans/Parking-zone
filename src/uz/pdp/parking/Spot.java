package uz.pdp.parking;

public class Spot {
    {
        number=""+counter;
        counter++;
    }
    private static int counter=0;
    private String number;
    private Car car;

    public Spot() {
    }


    public Spot(String number, Car car) {
        this.number = number;
        this.car = car;


    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Spot{" +
                "number='" + number + '\'' +
                ", car=" + car +
                '}';
    }
}
