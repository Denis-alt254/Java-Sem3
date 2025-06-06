import java.util.ArrayList;
import java.util.List;

class Car {
    private int carId;
    private String brand;
    private String model;
    private int year;
    private double dailyRate;
    private boolean isRented;

    public Car(int carId, String brand, String model, int year, double dailyRate) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
        this.isRented = false;
    }

    public boolean rent() {
        if (!isRented) {
            isRented = true;
            return true;
        }
        return false;
    }

    public boolean returnCar() {
        if (isRented) {
            isRented = false;
            return true;
        }
        return false;
    }

    public String getDetails() {
        return brand + " " + model + " (" + year + ")";
    }
}

class Customer {
    private int customerId;
    private String name;
    private String email;
    private List<Car> rentedCars;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.rentedCars = new ArrayList<>();
    }

    public String rentCar(Car car) {
        if (car.rent()) {
            rentedCars.add(car);
            return name + " rented " + car.getDetails() + ".";
        }
        return car.getDetails() + " is already rented.";
    }

    public String returnCar(Car car) {
        if (rentedCars.contains(car) && car.returnCar()) {
            rentedCars.remove(car);
            return name + " returned " + car.getDetails() + ".";
        }
        return name + " did not rent this car.";
    }
}

class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;

    public RentalAgency() {
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void listAvailableCars() {
        System.out.println("Available cars:");
        for (Car car : cars) {
            if (!car.rent()) {
                System.out.println(car.getDetails());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Car car1 = new Car(1, "Toyota", "Corolla", 2022, 50);
        Car car2 = new Car(2, "Honda", "Civic", 2023, 60);
        agency.addCar(car1);
        agency.addCar(car2);

        Customer customer = new Customer(1, "Denis", "denis@example.com");
        agency.addCustomer(customer);

        System.out.println(customer.rentCar(car1));
        System.out.println(customer.returnCar(car1));

        agency.listAvailableCars();
    }
}