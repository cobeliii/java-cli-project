import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

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

    private static void menuService(){
        boolean isTrue = true;
        menu();
        System.out.println("Pick one option from the menu");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 ->{
                System.out.println("Booking a car");
                System.out.println();
            }
            case 2 ->{
                System.out.println("Here are all the vehicles you have booked: ");
                System.out.println();
            }
            case 3 ->{
                System.out.println("All bookings: ");
                System.out.println();
            }

            case 4 -> {
                System.out.println("Available cars: ");
                System.out.println();
            }
            case 5 -> {
                System.out.println("Available electric cars: ");
                System.out.println();
            }
            case 6->{
                System.out.println("All users: ");
                System.out.println();
            }

            case 7 ->{
                isTrue = false;
                System.out.println("Thank you.");
            }

            default -> System.out.println("Insert a valid number.");


        }
    }
}