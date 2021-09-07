package com.upgrad.frs;

public abstract class Ticket {
    private static int pnrCounter;
    private String tPnrNumber;
    private String tSource;
    private String tDestination;
    private Flight flight;
    private String tArrivalTime;
    private String tDeparatureTime;
    private Passenger passenger;
    private String tSeatNumber;
    private String tStatus;
    private String tPrice;

    static {
        pnrCounter = 0;
    }

    public String getPnrNumber() {
        return this.tPnrNumber;
    }
    public Ticket(Passenger p, int flightNmber, int flightSeatsBooked,
                  int flightCapacity, String flightAirlineName,
                  String tSource, String tDestination,String tArrivalTime,
                  String tDeparatureTime, String tSeatNumber,
                  String tStatus, String tPrice) {
        this.flight = new Flight(flightNmber, flightSeatsBooked, flightCapacity, flightAirlineName);
        this.passenger = p;
        this.tPnrNumber = Integer.toString(++pnrCounter);
        this.tSource = tSource;
        this.tDestination = tDestination;
        this.tArrivalTime = tArrivalTime;
        this.tDeparatureTime = tDeparatureTime;
        this.tSeatNumber = tSeatNumber;
        this.tStatus = tStatus;
        this.tPrice = tPrice;
    }

    public void setPnrNumber(String tPnrNumber) {
        this.tPnrNumber = tPnrNumber;
    }

    public String getSource() {
        return tSource;
    }

    public void setSource(String tSource) {
        this.tSource = tSource;
    }

    public String getDestination() {
        return tDestination;
    }

    public void setDestination(String tDestination) {
        this.tDestination = tDestination;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getArrivalTime() {
        return tArrivalTime;
    }

    public void setArrivalTime(String tArrivalTime) {
        this.tArrivalTime = tArrivalTime;
    }

    public String getDeparatureTime() {
        return tDeparatureTime;
    }

    public void settDeparatureTime(String tDeparatureTime) {
        this.tDeparatureTime = tDeparatureTime;
    }

    public String getPassengerContact() {
        return passenger.getContactDetails();
    }

    public String getPassengerAddress() {
        return passenger.getAddressDetails();
    }

    public int getPassengerId() {
        return passenger.getId();
    }

    public String getSeatNumber() {
        return tSeatNumber;
    }

    public void setSeatNumber(String tSeatNumber) {
        this.tSeatNumber = tSeatNumber;
    }

    public String getStatus() {
        return tStatus;
    }

    public void setStatus(String tStatus) {
        this.tStatus = tStatus;
    }

    public String getPrice() {
        return tPrice;
    }

    public void settPrice(String tPrice) {
        this.tPrice = tPrice;
    }

    public String checkStatus() {
        return this.tStatus;
    }

    public int getDuration() {
        return Integer.parseInt(this.tDeparatureTime) - Integer.parseInt(this.tArrivalTime);
    }

    public void cancelTicket() {

    }
}