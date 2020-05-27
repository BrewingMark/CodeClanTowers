import java.util.ArrayList;

public class Room {

    private int number;
    private int capacity;
    private String type;
    private double rate;
    private ArrayList<Guest> guests;

    public Room(int number, int capacity, String type, double rate){
        this.number = number;
        this.capacity = capacity;
        this.type = type;
        this.rate = rate;
        this.guests = new ArrayList<Guest>();
    }


    public int getRoomNumber() {
        return this.number;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return this.type;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void checkOutGuest(Guest guest1) {
        this.guests.clear();
    }

    public double getRate() {
        return this.rate;
    }
}
