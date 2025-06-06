Car Rental System Documentation

1. Project Overview
The Car Rental System is a simple object-oriented Java application that manages car rentals. It allows:
- Customers to rent and return cars.
- A rental agency to manage available cars and customers.
- A testing suite to verify functionality using JUnit.

2. Technologies Used

- Java (JDK 11 or later)
- VS Code (recommended IDE)
- GitHub (for version control)

3. Class Descriptions

Car.java
Defines the Car entity:
- rent(): Marks the car as rented.
- returnCar(): Marks the car as available.
- getDetails(): Returns car details.
Customer.java
Represents a Customer:
- rentCar(Car car): Attempts to rent a car.
- returnCar(Car car): Returns a rented car.
RentalAgency.java
Manages rental operations:
- addCar(Car car): Adds a car to inventory.
- addCustomer(Customer customer): Registers a customer.
- listAvailableCars(): Shows available cars.
Main.java
The entry point to run the program:
- Creates cars and customers.
- Processes rental transactions.
- Displays available cars.
