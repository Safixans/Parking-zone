package uz.pdp.parking;

public class Car {
    private String model;
    private String color;
    private String number;
    private String type;

    public Car() {
    }

    public Car(String model, String color, String number, String type) {
        this.model = model;
        this.color = color;
        this.number = number;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "model: '" + model + '\'' +
                ", color: '" + color + '\'' +
                ", number:'" + number + '\'' +
                ", type: '" + type + '\'' ;
    }
}
