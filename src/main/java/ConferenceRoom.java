import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private boolean isBooked;
    private ArrayList<Guest> guests;
    private int capacity;

    public ConferenceRoom(String name, int capacity) {
        this.isBooked = false;
        this.name = name;
        this.guests = new ArrayList<Guest>();
        this.capacity = capacity;
    }

    public String getName() {
        return this.name;
    }


    public int getCapacity() {
        return this.capacity;
    }
}


