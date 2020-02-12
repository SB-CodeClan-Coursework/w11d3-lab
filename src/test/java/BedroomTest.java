import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Guest guest;
    Bedroom bedroom;

    @Before
    public void before() {
        guest = new Guest("Eggbert Jones", 90);
        bedroom = new Bedroom(
                39,
                2,
                "twin",
                false
        );
    }

    @Test
    public void canGetBedroomRoomNumber() {
    assertEquals(39, bedroom.roomNumber());
    }

    @Test
    public void canGetBedroomCapacity() {
        assertEquals(2, bedroom.capacity());
    }

    @Test
    public void canGetBedroomType() {
        assertEquals("twin", bedroom.roomType());
    }

    @Test
    public void canGetRoomBookedValue() {
        assertEquals(false, bedroom.isBooked());
    }

}
