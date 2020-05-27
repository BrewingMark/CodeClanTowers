import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest1;

    @Before
    public void before(){
        room = new Room(12,2,"double", 60.00);
        guest1 = new Guest("Hansel McDonald");
    }

    @Test
    public void roomHasNumber(){
        assertEquals(12, room.getRoomNumber());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void roomHasType(){
        assertEquals("double", room.getType());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, room.getNumberOfGuests());
    }

    @Test
    public void roomHasRate(){
        assertEquals(60.00, room.getRate(), 0.01);
    }

    @Test
    public void canAddGuest(){
        room.addGuest(guest1);
        assertEquals(1, room.getNumberOfGuests());
    }

    @Test
    public void canCheckOutGuest(){
        room.addGuest(guest1);
        room.checkOutGuest(guest1);
        assertEquals(0, room.getNumberOfGuests());
    }


}
