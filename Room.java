public class Room {
    private String roomType;
    private boolean isAvailable;

    public Room(String roomType) {
        this.roomType = roomType;
        this.isAvailable = true;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

