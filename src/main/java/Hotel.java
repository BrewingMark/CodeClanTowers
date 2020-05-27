import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Room> rooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(){
        this.rooms = new ArrayList<Room>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public int getRooms() {
        return this.rooms.size();
    }

    public int getConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addHotelRoom(Room room) {
        this.rooms.add(room);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public Booking makeBooking(Room room, int nightsBooked, Guest guest) {
        Booking booking = new Booking(room,nightsBooked);
        room.addGuest(guest);
        return booking;
    }

    public int getDiningRooms() {
        return this.diningRooms.size();
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

//    public ArrayList<Room> getEmptyRooms() {
//        ArrayList<Room> emptyRooms = this.rooms.removeIf();
//    }
}
