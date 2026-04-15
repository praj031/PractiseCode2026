package CarDelership;

public class Employee {

    private String employeeId;
    private String salesRating;
    private boolean availableForSalesOps;

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSalesRating() {
        return salesRating;
    }

    public void setSalesRating(String salesRating) {
        this.salesRating = salesRating;
    }

    public boolean isAvailableForSalesOps() {
        return availableForSalesOps;
    }

    public void setAvailableForSalesOps(boolean availableForSalesOps) {
        this.availableForSalesOps = availableForSalesOps;
    }

    //Other properties of the employee class
    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {

        if (finance == true && vehicle.isAvailable(true)) {
            double loanAmount = vehicle.getVehiclePrice() - customer.getCashOnHand();
            //To check the credit history
            runCreditHistory(customer, loanAmount);
        } else if (vehicle.getVehiclePrice() <= customer.getCashOnHand()) {
            processTransaction(customer, vehicle);
        } else {
            System.out.println("Customer " + customer.getName() + " needs more money to buy " + vehicle.getVehicleName());
        }
    }

    private void runCreditHistory(Customer cust, double amount) {
        System.out.println("Running credit history for " + cust.getName() + " for loan amount: " + amount);
        processTransaction(cust, null);
    }

    private void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("Sold vehicle " + (vehicle != null ? vehicle.getVehicleName() : "")  + " to " + cust.getName());
    }
}
