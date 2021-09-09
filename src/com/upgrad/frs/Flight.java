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

    public int getFlightNumber() {
        return this.fNumber;
    }

    public int getSeatsBooked() {
        return fSeatsBooked;
    }

    public void setSeatsBooked(int fSeatsBooked) {
        this.fSeatsBooked = fSeatsBooked;
    }

    public int getFlightCapacity() {
        return fCapacity;
    }

    public void setFlightCapacity(int fCapacity) {
        this.fCapacity = fCapacity;
    }

    public String getAirlineName() {
        return fAirlineName;
    }

    public void setAirlineName(String fAirlineName) {
        this.fAirlineName = fAirlineName;
    }

    public String getFlightDetails() {
        return "Flight Details: " + getFlightNumber() + ", " + getAirlineName() + ", " + getSeatsBooked() + ", " + getFlightCapacity();
    }

    public boolean isSeatAvailable() {
        if (this.fCapacity <= this.fSeatsBooked) {
            return false;
        } else {
            return true;
        }
    }

    public int updateSeatsAvailability(int fCapacity, int fSeatsBooked) {
        this.fCapacity = fCapacity;
        this.fSeatsBooked = fSeatsBooked;
        return this.fCapacity - this.fSeatsBooked;
    }


    public int getAvailableSeats() {
        return this.fCapacity - this.fSeatsBooked;
    }
}
