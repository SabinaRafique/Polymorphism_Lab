package hotels;

import customers.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rooms.DeluxeRoom;

import java.util.Collections;
import java.util.List;

import static customers.Gender.FEMALE;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class ReceptionistTest {

    private Receptionist receptionist;

    @BeforeEach
    public void setUp(){
        receptionist = new Receptionist("bob", 1);
    }

    @Test
    void addReservation() {
        Customer customer = new Customer("Emma Smith", 26, FEMALE, "878784375", Collections.singletonList(1));
        DeluxeRoom deluxeRoom = new DeluxeRoom(1, 10.00, "Emma Smith", false, customer);

        receptionist.addReservation(customer, deluxeRoom);
        int actual = customer.getReservation().size();

        assertThat(actual).isEqualTo(1);
    }

    @Test
    void removeReservation() {
        Customer customer = new Customer("Emma Smith", 26, FEMALE, "878784375", Collections.singletonList(1));

        receptionist.removeReservation(customer);
        int actual = customer.getReservation().size();

        assertThat(actual).isEqualTo(0);
    }

}