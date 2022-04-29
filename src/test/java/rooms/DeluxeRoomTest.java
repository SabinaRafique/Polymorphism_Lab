package rooms;

import customers.Customer;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static customers.Gender.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



class DeluxeRoomTest {

    @Test
    void occupiedBy2() {
        Customer customer = new Customer("Jane doe", 26, FEMALE, "878784375", Collections.singletonList(1));
        Customer customer2 = new Customer("Emma Smith", 26, FEMALE, "878784375", Collections.singletonList(1));
        DeluxeRoom deluxeRoom = new DeluxeRoom(1, 10.00, "Jane Doe", false, customer);
        String actual = deluxeRoom.occupiedBy(customer2, deluxeRoom);
        assertThat(actual).isEqualTo("Emma Smith");

    }

    @Test
    void testOccupiedBy() {
        Customer customer = new Customer("Emma Smith", 26, FEMALE, "878784375", Collections.singletonList(1));
        DeluxeRoom deluxeRoom = new DeluxeRoom(1, 10.00, "Emma Smith", false, customer);
        String actual = deluxeRoom.occupiedBy();
        assertThat(actual).isEqualTo("Emma Smith");
    }
}