package rooms;

import customers.Customer;

public abstract class Rooms {
    private int roomNumber;
    private double roomPrice;
    private String occupiedBy;
    private boolean available;
    protected Customer customer;

    public Rooms(int roomNumber, double roomPrice, String occupiedBy, boolean available, Customer customer) {
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.occupiedBy = occupiedBy;
        this.available = available;
        this.customer = customer;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getOccupiedBy() {
        return occupiedBy;
    }

    public static String setOccupiedBy(String occupiedBy) {
        return occupiedBy;
    }


    protected abstract String occupiedBy(Customer customer, Rooms rooms);

    protected abstract String occupiedBy();


//    public Customer getOccupant() {
//        return occupant;
//    }
//
//    public void setOccupant(Customer occupant) {
//        this.occupant = occupant;
//    }

//    private final(RoomStatus roomStatus);
//    private Rooms (RoomStatus roomStatus) {this.roomStatus = roomStatus; }


}
