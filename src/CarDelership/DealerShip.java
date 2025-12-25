package CarDelership;

public class DealerShip {
    public static void main(String[] args) {
        //Main method

        boolean finance = true;
        //Class injection and setting values
         Customer customer1 = new Customer();
         customer1.setName("Pritish Raj");
         customer1.setAddress("Jamshedpur");
         customer1.setCashOnHand(12000);

         Vehicle vehicle1 = new Vehicle();
         vehicle1.setVehicleName("Audi");
         vehicle1.setVehiclePrice(19000);
         vehicle1.setVehicleModelNumber("A4:2025");
         vehicle1.setAvailable(true);

         Employee employee1 = new Employee();
         employee1.setEmployeeId("AU10000219");
         employee1.setSalesRating("3.5");
         employee1.setAvailableForSalesOps(true);

         customer1.purchaseCar(vehicle1,employee1,finance);

    }
}
