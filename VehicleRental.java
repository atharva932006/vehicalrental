package ASSIGEMENT;


import java.util.Scanner;

class Vehicle {

    private String vehicleNumber;
    private String model;
    private String customerName;
    private int rentalDays;

    Vehicle(String vehicleNumber, String model, String customerName, int rentalDays) {

        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.customerName = customerName;
        this.rentalDays = rentalDays;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void displayDetails() {

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Model         : " + model);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Rental Days   : " + rentalDays);
    }
}


// Car class
class Car extends Vehicle {

    private int numberOfSeats;

    Car(String vehicleNumber, String model, String customerName,
        int rentalDays, int numberOfSeats) {

        super(vehicleNumber, model, customerName, rentalDays);
        this.numberOfSeats = numberOfSeats;
    }

    public void displayDetails() {

        System.out.println("Vehicle Type  : Car");
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Rate Per Day  : ₹1500");
    }

    public double calculateCharges() {

        return getRentalDays() * 1500;
    }
}


// Bike class
class Bike extends Vehicle {

    private int engineCapacity;

    Bike(String vehicleNumber, String model, String customerName,
         int rentalDays, int engineCapacity) {

        super(vehicleNumber, model, customerName, rentalDays);
        this.engineCapacity = engineCapacity;
    }

    public void displayDetails() {

        System.out.println("Vehicle Type  : Bike");
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Rate Per Day  : ₹700");
    }

    public double calculateCharges() {

        return getRentalDays() * 700;
    }
}


// Scooter class
class Scooter extends Vehicle {

    private int storageCapacity;

    Scooter(String vehicleNumber, String model, String customerName,
            int rentalDays, int storageCapacity) {

        super(vehicleNumber, model, customerName, rentalDays);
        this.storageCapacity = storageCapacity;
    }

    public void displayDetails() {

        System.out.println("Vehicle Type  : Scooter");
        super.displayDetails();
        System.out.println("Storage Capacity: " + storageCapacity + " litres");
        System.out.println("Rate Per Day  : ₹500");
    }

    public double calculateCharges() {

        return getRentalDays() * 500;
    }
}


// Additional ElectricCar class
class ElectricCar extends Vehicle {

    private int batteryCapacity;

    ElectricCar(String vehicleNumber, String model, String customerName,
                int rentalDays, int batteryCapacity) {

        super(vehicleNumber, model, customerName, rentalDays);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayDetails() {

        System.out.println("Vehicle Type  : Electric Car");
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Rate Per Day  : ₹2000");
    }

    public double calculateCharges() {

        return getRentalDays() * 2000;
    }
}


public class VehicleRental {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehicle vehicle = null;

        while (true) {

            System.out.println();
            System.out.println("===== Vehicle Rental System =====");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Scooter");
            System.out.println("4. Display Rental Details");
            System.out.println("5. Calculate Rental Charges");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter vehicle number: ");
                    String carNumber = sc.nextLine();

                    System.out.print("Enter model: ");
                    String carModel = sc.nextLine();

                    System.out.print("Enter customer name: ");
                    String carCustomer = sc.nextLine();

                    System.out.print("Enter rental days: ");
                    int carDays = sc.nextInt();

                    System.out.print("Enter number of seats: ");
                    int seats = sc.nextInt();

                    vehicle = new Car(carNumber, carModel, carCustomer,
                            carDays, seats);

                    System.out.println();
                    System.out.println("Vehicle rented successfully.");

                    break;


                case 2:

                    System.out.print("Enter vehicle number: ");
                    String bikeNumber = sc.nextLine();

                    System.out.print("Enter model: ");
                    String bikeModel = sc.nextLine();

                    System.out.print("Enter customer name: ");
                    String bikeCustomer = sc.nextLine();

                    System.out.print("Enter rental days: ");
                    int bikeDays = sc.nextInt();

                    System.out.print("Enter engine capacity: ");
                    int engine = sc.nextInt();

                    vehicle = new Bike(bikeNumber, bikeModel, bikeCustomer,
                            bikeDays, engine);

                    System.out.println();
                    System.out.println("Vehicle rented successfully.");

                    break;


                case 3:

                    System.out.print("Enter vehicle number: ");
                    String scooterNumber = sc.nextLine();

                    System.out.print("Enter model: ");
                    String scooterModel = sc.nextLine();

                    System.out.print("Enter customer name: ");
                    String scooterCustomer = sc.nextLine();

                    System.out.print("Enter rental days: ");
                    int scooterDays = sc.nextInt();

                    System.out.print("Enter storage capacity: ");
                    int storage = sc.nextInt();

                    vehicle = new Scooter(scooterNumber, scooterModel,
                            scooterCustomer, scooterDays, storage);

                    System.out.println();
                    System.out.println("Vehicle rented successfully.");

                    break;


                case 4:

                    if (vehicle != null) {
                        System.out.println();
                        System.out.println("===== Vehicle Rental Receipt =====");
                        vehicle.displayDetails();
                    } else {
                        System.out.println("No vehicle rented yet.");
                    }

                    break;


                case 5:

                    if (vehicle == null) {
                        System.out.println("No vehicle rented yet.");
                    } else {

                        double amount = 0;

                        if (vehicle instanceof Car) {
                            amount = ((Car) vehicle).calculateCharges();
                        } else if (vehicle instanceof Bike) {
                            amount = ((Bike) vehicle).calculateCharges();
                        } else if (vehicle instanceof Scooter) {
                            amount = ((Scooter) vehicle).calculateCharges();
                        }

                        System.out.println("Total Amount  : ₹" + amount);
                    }

                    break;


                case 6:

                    System.out.println("Thank you! Exiting the program.");
                    sc.close();
                    return;


                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

