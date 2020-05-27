import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Room room1;
    Room room2;
    Guest guest1;
    ConferenceRoom conferenceRoom1;
    Booking booking1;
    DiningRoom diningRoom1;

    @Before
    public void before(){
        hotel = new Hotel();
        room1 = new Room(1,2,"double", 60.00);
        room2 = new Room(1,2,"double", 60.00);
        guest1 = new Guest("Andy Anderson");
        conferenceRoom1 = new ConferenceRoom("The Zoolander Suite", 5);
        booking1 = new Booking(room1,4);
        diningRoom1 = new DiningRoom("Benny's");
    }

    @Test
    public void canGetHotelRooms(){
        assertEquals(0, hotel.getRooms());
    }

    @Test
    public void canGetConferenceRooms(){
        assertEquals(0, hotel.getConferenceRooms());
    }

    @Test
    public void canAddHotelRoom(){
        hotel.addHotelRoom(room1);
        assertEquals(1, hotel.getRooms());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.getConferenceRooms());
    }

    @Test
    public void canBookRoom(){
        hotel.addHotelRoom(room1);
        Booking newBooking = hotel.makeBooking(room1,4, guest1);
        assertEquals(booking1.getRoom(), newBooking.getRoom());
        assertEquals(booking1.getNightsBooked(), newBooking.getNightsBooked());
    }

    @Test
    public void canGetDiningRooms(){
        assertEquals(0, hotel.getDiningRooms());
    }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom1);
        assertEquals(1, hotel.getDiningRooms());
    }

    @Test
     public void canGetEmptyBedrooms(){
        hotel.addHotelRoom(room1);
        hotel.addHotelRoom(room2);
        hotel.makeBooking(room2, 3, guest1);
        assertEquals(1, hotel.getEmptyRooms());
    }

}
