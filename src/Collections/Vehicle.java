package Collections;

public class Vehicle {

    private String name;
    private String model;
    private String color;
    private boolean isAvailable;

    public Vehicle() {
    }

    public Vehicle(String name, String model, String color, boolean isAvailable) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Vehicle{name='" + name + "', model='" + model +
                "', color='" + color + "', available=" + isAvailable + "}";
    }


}
