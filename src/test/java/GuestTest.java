import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("McTavish", 27);
    }

    @Test
    public void canGetGuestName() {
        assertEquals("McTavish", guest.getName());
    }

    @Test
    public void canGetGuestAge() {
        assertEquals(27, guest.getAge());
    }
}
