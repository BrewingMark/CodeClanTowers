import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Steven Smith");
    }

    @Test
    public void guestHasName(){
        assertEquals("Steven Smith", guest.getName());
    }

}
