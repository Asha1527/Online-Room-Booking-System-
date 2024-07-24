import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Reservation> reservations = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();

    public BookingService() {
        rooms.add(new Room("Single"));
        rooms.add(new Room("Double"));
    }

    public boolean bookRoom(Reservation reservation) {
        for (Room room : rooms) {
            if (room.getRoomType().equalsIgnoreCase(reservation.getRoomType()) && room.isAvailable()) {
                room.setAvailable(false);
                reservations.add(reservation);
                return true;
            }
        }
        return false;
    }

    public List<Reservation> getReservations() {
        return new ArrayList<>(reservations);
    }
}

