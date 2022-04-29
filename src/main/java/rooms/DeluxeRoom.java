package rooms;

import customers.Customer;

public class DeluxeRoom extends Rooms{

    public DeluxeRoom(int roomNumber, double roomPrice, String occupiedBy, boolean available, Customer customer) {
        super(roomNumber, roomPrice, occupiedBy, available, customer);
    }

    @Override
    protected String occupiedBy(Customer customer, Rooms rooms) {
        rooms.setAvailable(true);
        return setOccupiedBy(customer.getName());
    }

    @Override
    protected String occupiedBy(){
        String name = this.customer.getName();
        return Rooms.setOccupiedBy(name);
    }
}
