package booking;

import car.*;
import user.*;

import java.util.Scanner;

import static car.EngineType.Electric;

public class BookingService {

    private static final Scanner scanner = new Scanner(System.in);
    private final CarDAO carDAO;
    private final UserDAO userDAO;

    private final User[] users;

    private final Car[] cars;

    public BookingService(CarDAO carDAO, UserDAO userDAO) {
        this.carDAO = carDAO;
        this.userDAO = userDAO;
        this.users = userDAO.getUsers();
        this.cars = carDAO.getCars();
    }

    public void viewAllCars(){
        for (Car car: cars){
            System.out.println(car);
        }
    }

    public void viewAllUsers(){
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void viewElectricCars(){
        for (Car car : cars) {
            if (car.getEngineType().equals(Electric)){
                System.out.println(car);
            }
        }
    }

    public void bookCar(){
        viewAllCars();
        System.out.print("Enter the id of the car you want to book: ");
        int id = scanner.nextInt();
        System.out.println("Enter user: ");
        String username = scanner.nextLine();
        for (User user: users){
            if (user.getName().equals(username)){
                
            }
        }
    }

}
