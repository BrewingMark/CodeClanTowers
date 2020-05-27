import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {


    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("The Smith Suite", 5);
    }

    @Test
    public void roomHasName(){
        assertEquals("The Smith Suite", conferenceRoom.getRoomName());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(5, conferenceRoom.getCapacity());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }


}
