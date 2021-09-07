package com.upgrad.frs;

public class Ticket {
    String tPnrNumber;
    String tSource;
    String tDestination;
    Flight flight;
    String tArrivalTime;
    String tDeparatureTime;
    String passenger;
    String tSeatNumber;
    String tStatus;
    String tPrice;

    public Ticket(String tPnrNumber, String tSource, String tDestination, Flight flight, String tArrivalTime, String tDeparatureTime, String passenger, String tSeatNumber, String tStatus, String tPrice) {
        this.tPnrNumber = tPnrNumber;
        this.tSource = tSource;
        this.tDestination = tDestination;
        this.flight = flight;
        this.tArrivalTime = tArrivalTime;
        this.tDeparatureTime = tDeparatureTime;
        this.passenger = passenger;
        this.tSeatNumber = tSeatNumber;
        this.tStatus = tStatus;
        this.tPrice = tPrice;
    }

    public String gettPnrNumber() {
        return tPnrNumber;
    }

    public void settPnrNumber(String tPnrNumber) {
        this.tPnrNumber = tPnrNumber;
    }

    public String gettSource() {
        return tSource;
    }

    public void settSource(String tSource) {
        this.tSource = tSource;
    }

    public String gettDestination() {
        return tDestination;
    }

    public void settDestination(String tDestination) {
        this.tDestination = tDestination;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String gettArrivalTime() {
        return tArrivalTime;
    }

    public void settArrivalTime(String tArrivalTime) {
        this.tArrivalTime = tArrivalTime;
    }

    public String gettDeparatureTime() {
        return tDeparatureTime;
    }

    public void settDeparatureTime(String tDeparatureTime) {
        this.tDeparatureTime = tDeparatureTime;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public String gettSeatNumber() {
        return tSeatNumber;
    }

    public void settSeatNumber(String tSeatNumber) {
        this.tSeatNumber = tSeatNumber;
    }

    public String gettStatus() {
        return tStatus;
    }

    public void settStatus(String tStatus) {
        this.tStatus = tStatus;
    }

    public String gettPrice() {
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
