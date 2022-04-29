package hotels;

import customers.Customer;
import rooms.Rooms;

public interface IReception {

    int addReservation(Customer customer, Rooms rooms);
    int removeReservation(Customer customer);
}
