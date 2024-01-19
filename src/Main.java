import booking.BookingService;
import car.CarDAO;
import user.UserDAO;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CarDAO carDAO = new CarDAO();
        UserDAO userDAO = new UserDAO();
        BookingService bookingService = new BookingService(carDAO, userDAO);
        menuService(bookingService);
    }

    public static void menu(){
        System.out.println("1️⃣ - Book Car");
        System.out.println("2️⃣ - View All user Booked Cars");
        System.out.println("3️⃣ - View All Bookings");
        System.out.println("4️⃣ - View Available Cars");
        System.out.println("5️⃣ - View Available Electric Cars");
        System.out.println("6️⃣ - View All Users");
        System.out.println("7️⃣ - Exit");
    }

    private static void menuService(BookingService bookingService){
        boolean isTrue = true;
        menu();
        System.out.println("Pick one option from the menu");
        int choice = scanner.nextInt();
        while (isTrue) {
            menu();
            System.out.println("Pick one option from the menu");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Booking a car");

                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Here are all the vehicles you have booked: ");
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("All bookings: ");
                    System.out.println();
                }

                case 4 -> {
                    System.out.println("Available cars: ");
                    bookingService.viewAllCars();
                }
                case 5 -> {
                    System.out.println("Available electric cars: ");
                    bookingService.viewElectricCars();
                    System.out.println();
                }
                case 6 -> {
                    System.out.println("All users: ");
                    bookingService.viewAllUsers();
                    System.out.println();
                }

                case 7 -> {
                    isTrue = false;
                    System.out.println("Thank you.");
                }

                default -> System.out.println("Insert a valid number.");


            }
        }
    }
}