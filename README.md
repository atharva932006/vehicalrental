Vehicle Rental System

A Java console-based Vehicle Rental System that demonstrates inheritance, encapsulation, method overriding, and runtime polymorphism.

Features

Rent a Car

Rent a Bike

Rent a Scooter

Display rental details

Calculate rental charges

Exit the program

Vehicle Types and Rates

Vehicle Type

Rate Per Day

Additional Information

Car

₹1500

Number of seats

Bike

₹700

Engine capacity in cc

Scooter

₹500

Storage capacity in litres

Electric Car

₹2000

Battery capacity in kWh

Note: The current menu allows renting a Car, Bike, or Scooter. The ElectricCar class is included in the source code but is not currently available as a menu option.

Java Concepts Used

This project demonstrates:

Classes and Objects

Encapsulation

Inheritance

Method Overriding

Runtime Polymorphism

super keyword

instanceof operator

Constructors

Private data members

Getter methods

Conditional statements

Switch-case

While loop

Scanner for user input

Class Structure

Vehicle
├── Car
├── Bike
├── Scooter
└── ElectricCar

The Vehicle class is the parent class. Car, Bike, Scooter, and ElectricCar inherit from it.

Rental Charge Calculation

Car

Rental Days × ₹1500

Bike

Rental Days × ₹700

Scooter

Rental Days × ₹500

Electric Car

Rental Days × ₹2000

Example

If a customer rents a car for 3 days:

3 × ₹1500 = ₹4500

How to Run

Make sure Java is installed on your computer.

1. Compile the program

If the file is inside a package named ASSIGEMENT, compile it from the directory containing the ASSIGEMENT folder:

javac ASSIGEMENT/VehicleRental.java

2. Run the program

java ASSIGEMENT.VehicleRental

Program Menu

===== Vehicle Rental System =====
1. Rent a Car
2. Rent a Bike
3. Rent a Scooter
4. Display Rental Details
5. Calculate Rental Charges
6. Exit

Example

Enter your choice: 1

Enter vehicle number: MH46AB1234
Enter model: Swift
Enter customer name: Atharva
Enter rental days: 3
Enter number of seats: 5

Vehicle rented successfully.

Selecting Display Rental Details shows:

===== Vehicle Rental Receipt =====
Vehicle Type  : Car
Vehicle Number: MH46AB1234
Model         : Swift
Customer Name : Atharva
Rental Days   : 3
Number of Seats: 5
Rate Per Day  : ₹1500

Selecting Calculate Rental Charges gives:

Total Amount  : ₹4500.0

Project Structure

ASSIGEMENT/
└── VehicleRental.java

README.md

Author

Atharva

Purpose

This project is created for educational/academic purposes to demonstrate fundamental Object-Oriented Programming concepts in Java.
