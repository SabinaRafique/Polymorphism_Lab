package customers;

import rooms.Rooms;

import java.util.List;

public class Customer {
    private String name;
    private int age;
    private Gender gender;
    private String mobileNumber;
    private boolean checkedIn;
    private Rooms room;
    private List<Integer> reservation;

    public Customer(String name, int age, Gender gender, String mobileNumber, List<Integer> reservation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.reservation = reservation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Rooms getRoom() {
        return room;
    }

    public void setRoom(Rooms room) {
        this.room = room;
    }

    public List<Integer> getReservation() {
        return reservation;
    }

    public void setReservation(List<Integer> reservation) {
        this.reservation = reservation;
    }
}
