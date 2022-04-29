package hotels;

import rooms.Rooms;

import java.util.List;

public class Hotel {
    private String name;
    private List<Rooms> rooms;

    public Hotel(String name, List<Rooms> rooms) {
        this.name = name;
        this.rooms = rooms;
    }

}
