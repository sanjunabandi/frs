package com.upgrad.frs;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] tourismLocationSelected = new String[5];

    public TouristTicket(Passenger p, int flightNumber, int flightSeatsBooked,
                         int flightCapacity, String flightAirlineName,
                         String tSource, String tDestination,String tArrivalTime,
                         String tDeparatureTime, String tSeatNumber,
                         String tStatus, String tPrice, String hotelAddress, String[] tourismLocationSelected) {
            super(p, flightNumber, flightSeatsBooked, flightCapacity, flightAirlineName,
                    tSource, tDestination,tArrivalTime, tDeparatureTime, tSeatNumber, tStatus, tPrice);
        this.hotelAddress = hotelAddress;
        this.tourismLocationSelected = tourismLocationSelected;
    }

    public String[] getTourismLocationSelected() {
        return tourismLocationSelected;
    }

    public void setTourismLocationSelected(String[] tourismLocationSelected) {
        this.tourismLocationSelected = tourismLocationSelected;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
}
