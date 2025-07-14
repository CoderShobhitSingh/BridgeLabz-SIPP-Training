package Day_5_Encapsulation_Polymorphism_Abstract.Vehicle_Rental_System;

import java.util.*;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MH12AB1234", 2000, "CARPOL1234567890"));
        vehicles.add(new Bike("DL5SAX1234", 500, "BIKPOL9876543210"));
        vehicles.add(new Truck("UP16TR1234", 4000, "TRKPOL4567891230"));

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());
            System.out.println("Rental Rate/Day: ₹" + v.getRentalRate());

            double rentalCost = v.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: ₹" + rentalCost);

            if (v instanceof Insurable) {
                Insurable insurable = (Insurable) v;
                System.out.println(insurable.getInsuranceDetails());
            }

        }
    }
}

