import java.util.ArrayList;

public class Bedroom {

    private static int roomNumber;
    private static int capacity;
    private static String roomType;
    private static boolean isBooked;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber,
                   int capacity,
                   String roomType,
                   boolean isBooked) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();
        this.isBooked = false;

    }


    public int roomNumber() {
        return Bedroom.roomNumber;
    }

    public int capacity() {
        return Bedroom.capacity;
    }

    public String roomType() {
        return Bedroom.roomType;
    }

    public boolean isBooked() {
        return Bedroom.isBooked;
    }

    public int guestCount() { return guests.size(); }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(0);
    }
}

