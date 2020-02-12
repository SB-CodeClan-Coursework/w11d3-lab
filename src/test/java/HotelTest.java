import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        guest = new Guest("Shane", 30);
        bedroom = new Bedroom(
                39,
                2,
                "double",
                true);
        conferenceRoom = new ConferenceRoom(
                "COBOL Suite 2",
                12
        );
    }

    @Test
    public void canAddGuestToRoom() {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(4, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuestFromRoom() {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }


}
