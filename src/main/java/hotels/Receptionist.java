package hotels;

import customers.Customer;
import rooms.DeluxeRoom;
import rooms.LuxurySuite;
import rooms.Rooms;
import rooms.StandardRoom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Receptionist implements IReception {
   private String name;
   private int EmployeeID;

    public Receptionist(String name, int employeeID) {
        this.name = name;
        EmployeeID = employeeID;
    }


    public int addReservation(Customer customer, Rooms rooms){
        customer.setReservation(Collections.singletonList(rooms.getRoomNumber()));
        return 1;
    }

    public int removeReservation(Customer customer){
        List<Integer> l = new ArrayList<>();
        customer.setReservation(l);
        return 0;
    }

}
