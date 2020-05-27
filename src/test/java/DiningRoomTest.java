import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom1;
    Guest guest;

    @Before
    public void before(){
        diningRoom1 = new DiningRoom("Frankies");
        guest = new Guest("Joe Blogs");
    }

    @Test
    public void DiningRoom1HasName(){
        assertEquals("Frankies", diningRoom1.getName());
    }

    @Test
    public void canGetGuests(){
        assertEquals(0, diningRoom1.getGuests());
    }

    @Test
    public void canAddGuest(){
        diningRoom1.addGuest(guest);
        assertEquals(1, diningRoom1.getGuests());
    }

    @Test
    public void canRemoveGuest(){
        diningRoom1.addGuest(guest);
        diningRoom1.removeGuest(guest);
        assertEquals(0, diningRoom1.getGuests());
    }

}
