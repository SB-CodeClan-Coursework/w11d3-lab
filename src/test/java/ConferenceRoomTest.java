import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("COBOL Suite",
                9);
    }

    @Test
    public void canGetConferenceRoomName() {
        assertEquals("COBOL Suite", conferenceRoom.getName());
    }

    @Test
    public void canGetConferenceRoomCapacity() {
        assertEquals(9, conferenceRoom.getCapacity());
    }
}
