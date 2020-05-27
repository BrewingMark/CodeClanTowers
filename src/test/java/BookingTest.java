import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Room room;

    @Before
    public void before(){
        room = new Room(2,2,"twin", 55.00);
        booking = new Booking(room,3);
    }

    @Test
    public void bookingHasRoom(){
        assertEquals(room, booking.getRoom());
    }

    @Test
    public void bookingHasNightsBooked(){
        assertEquals(3, booking.getNightsBooked());
    }

}
