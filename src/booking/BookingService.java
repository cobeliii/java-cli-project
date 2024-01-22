package booking;

import car.*;
import user.*;

import java.util.Optional;
import java.util.Scanner;

import static car.EngineType.Electric;

public class BookingService {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scanner1 = new Scanner(System.in);
    private static final CarDAO carDAO = new CarDAO();
    private static final UserDAO userDAO = new UserDAO();


    private final CarService carService;

    private final UserService userService;

    public BookingService(CarService carService, UserService userService) {
        this.carService = new CarService(carDAO);
        this.userService = new UserService(userDAO);
    }
    public void viewAllUsers(){
        userService.viewAllUsers();
    }

    public void viewAllCars(){
        carService.viewAllCars();
    }

    public void viewElectricCars(){
        carService.viewElectricCars();
    }

    public void bookCar(){
        viewAllCars();
        System.out.print("Enter the id of the car you want to book: ");
        int id = scanner.nextInt();
        Car car = carService.getCar(id);
        System.out.print("Enter name: ");
        String name = scanner1.nextLine();
        User user = userService.getUser(name);
        if(user != null){
            car.setUser(user);
            car.setBooked(true);
            System.out.println("Booking is successful1");
        }else{
            System.out.println("Invalid name");
        }
    }

    public void viewAllBookings(){
        carService.viewAllBookings();
    }

}
