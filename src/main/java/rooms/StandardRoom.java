package rooms;

import customers.Customer;

public class StandardRoom extends Rooms {

    public StandardRoom(int roomNumber, double roomPrice, String occupiedBy, boolean available, Customer customer) {
        super(roomNumber, roomPrice, occupiedBy, available, customer);
    }

    @Override
    protected String occupiedBy(Customer customer, Rooms rooms) {
        rooms.setAvailable(true);
        return rooms.setOccupiedBy(customer.getName());
    }

    @Override
    protected String occupiedBy(){
        String name = this.customer.getName();
        return Rooms.setOccupiedBy(name);
    }
}
