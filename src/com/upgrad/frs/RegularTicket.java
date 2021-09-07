package com.upgrad.frs;

public class RegularTicket extends Ticket{
    private String specialService;

    public RegularTicket(Passenger p, int flightNumber, int flightSeatsBooked,
                         int flightCapacity, String flightAirlineName,
                         String tSource, String tDestination,String tArrivalTime,
                         String tDeparatureTime, String tSeatNumber,
                         String tStatus, String tPrice, String specialService) {
        super(p, flightNumber, flightSeatsBooked, flightCapacity, flightAirlineName,
                tSource, tDestination,tArrivalTime, tDeparatureTime, tSeatNumber, tStatus, tPrice);
        this.specialService = specialService;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    public void specialServicesAvailed(String specialService) {

    }
}
