package Day_4_Inheritense;

public class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }   

    static class Car extends Vehicle {
        int seatCapacity;

        Car(int maxSpeed, String fuelType, int numDoors) {
            super(maxSpeed, fuelType);
            this.seatCapacity = numDoors;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Number of Doors: " + seatCapacity);
        }
    }

    static class Truck extends Vehicle {
        int loadCapacity;

        Truck(int maxSpeed, String fuelType, int loadCapacity) {
            super(maxSpeed, fuelType);
            this.loadCapacity = loadCapacity;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Load Capacity: " + loadCapacity + " tons");
        }
    }
    
    static class Motorcycle extends Vehicle {
        String type;

        Motorcycle(int maxSpeed, String fuelType, String type) {
            super(maxSpeed, fuelType);
            this.type = type;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Motorcycle Type: " + type);
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Car(200, "Petrol", 4);
        Vehicle truck = new Truck(120, "Diesel", 10);
        Vehicle motorcycle = new Motorcycle(180, "Petrol", "Sport");

        car.displayInfo();
        System.out.println();
        truck.displayInfo();
        System.out.println();
        motorcycle.displayInfo();
    }

}
