import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private boolean isBooked;
    private ArrayList<Guest> guests;
    private int capacity;



    public ConferenceRoom(String name, int capacity) {
        this.isBooked = false;
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public boolean isBooked() {
        return isBooked;
    }
}


