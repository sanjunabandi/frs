package com.upgrad.frs;

public class Flight {
    private int fNumber;
    private int fSeatsBooked;
    private int fCapacity;
    private String fAirlineName;

    public Flight(int fNumber, int fSeatsBooked, int fCapacity, String fAirlineName) {
        this.fNumber = fNumber;
        this.fSeatsBooked = fSeatsBooked;
        this.fCapacity = fCapacity;
        this.fAirlineName = fAirlineName;
    }

    public int getfNumber() {
        return fNumber;
    }

    public void setfNumber(int fNumber) {
        this.fNumber = fNumber;
    }

    public int getfSeatsBooked() {
        return fSeatsBooked;
    }

    public void setfSeatsBooked(int fSeatsBooked) {
        this.fSeatsBooked = fSeatsBooked;
    }

    public int getfCapacity() {
        return fCapacity;
    }

    public void setfCapacity(int fCapacity) {
        this.fCapacity = fCapacity;
    }

    public String getfAirlineName() {
        return fAirlineName;
    }

    public void setfAirlineName(String fAirlineName) {
        this.fAirlineName = fAirlineName;
    }

    public String getFlightDetails() {
        return "";
    }

    public boolean isSeatAvailable() {
        return true; //TODO
    }

    public void updateSeatsAvailable() {

    }
}
