import java.util.Scanner;

public class BookingSystem {
    private static BookingService bookingService = new BookingService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Online Booking System");
            System.out.println("1. Book a Room");
            System.out.println("2. View Reservations");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    bookRoom();
                    break;
                case 2:
                    viewReservations();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void bookRoom() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter room type (Single/Double): ");
        String roomType = scanner.nextLine();
        System.out.print("Enter check-in date (YYYY-MM-DD): ");
        String checkInDate = scanner.nextLine();
        System.out.print("Enter check-out date (YYYY-MM-DD): ");
        String checkOutDate = scanner.nextLine();

        Reservation reservation = new Reservation(name, roomType, checkInDate, checkOutDate);
        boolean success = bookingService.bookRoom(reservation);
        if (success) {
            System.out.println("Room booked successfully!");
        } else {
            System.out.println("Failed to book room. Please try again.");
        }
    }

    private static void viewReservations() {
        System.out.println("Reservations:");
        for (Reservation reservation : bookingService.getReservations()) {
            System.out.println(reservation);
        }
    }
}
