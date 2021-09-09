package com.upgrad.frs;

public class RegularTicket extends Ticket {
    private String specialService;

    public RegularTicket(Passenger p, Flight f,
                         String tSource, String tDestination, String tDeparatureTime,
                         String tArrivalTime, String tSeatNumber,
                         String tStatus, String tPrice, String specialService) {
        super(p, f, tSource, tDestination, tDeparatureTime, tArrivalTime, tSeatNumber, tStatus, tPrice);
        this.specialService = specialService;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }
}
