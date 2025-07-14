package Day_5_Encapsulation_Polymorphism_Abstract.Vehicle_Rental_System;

public abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public String getMaskedPolicyNumber() {
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }

    public abstract double calculateRentalCost(int days);
}

