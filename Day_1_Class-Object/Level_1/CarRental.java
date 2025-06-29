public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int costPerDay;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.costPerDay = getCostPerDay(this.carModel);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = getCostPerDay(carModel);
    }

    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.costPerDay = other.costPerDay;
    }

    private int getCostPerDay(String model) {
        switch (model.toLowerCase()) {
            case "sedan":
                return 1500;
            case "suv":
                return 2000;
            case "hatchback":
                return 1000;
            default:
                return 1200; 
        }
    }

    public int calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per Day: ₹" + costPerDay);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Shobhit Singh", "SUV", 5);
        rental1.displayDetails();

        System.out.println();

        CarRental rental2 = new CarRental(rental1); 
        rental2.displayDetails();
    }
}

