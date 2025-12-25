package CarDelership;

public class Vehicle {

    private String vehicleName;
    private String vehicleModelNumber;
    private int vehiclePrice;
    private boolean isAvailable;

    public Vehicle() {
    }

    public Vehicle(String vehicleName, String vehicleModelNumber, int vehiclePrice, boolean isAvailable) {
        this.vehicleName = vehicleName;
        this.vehicleModelNumber = vehicleModelNumber;
        this.vehiclePrice = vehiclePrice;
        this.isAvailable = isAvailable(true);
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModelNumber() {
        return vehicleModelNumber;
    }

    public void setVehicleModelNumber(String vehicleModelNumber) {
        this.vehicleModelNumber = vehicleModelNumber;
    }

    public boolean isAvailable(boolean b) {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(int vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }





}
