public class Reservation {
    private String name;
    private String roomType;
    private String checkInDate;
    private String checkOutDate;

    public Reservation(String name, String roomType, String checkInDate, String checkOutDate) {
        this.name = name;
        this.roomType = roomType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getName() {
        return name;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "name='" + name + '\'' +
                ", roomType='" + roomType + '\'' +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                '}';
    }
}

