package com.upgrad.frs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] tourismLocationSelected = new String[5];

    public TouristTicket(Passenger p, Flight f, String tSource, String tDestination, String tDeparatureTime,
                         String tArrivalTime, String tSeatNumber,
                         String tStatus, String tPrice, String hotelAddress, String[] tourismLocationSelected) {
        super(p, f, tSource, tDestination, tDeparatureTime, tArrivalTime, tSeatNumber, tStatus, tPrice);
        this.hotelAddress = hotelAddress;
        this.tourismLocationSelected = tourismLocationSelected;
    }

    public String[] getTourismLocationSelected() {
        return tourismLocationSelected;
    }

    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void addTouristLocation(String newLocation) {
        List<String> list = new ArrayList<String>(Arrays.asList(this.tourismLocationSelected));
        if (list.size() < 5) {
            list.add(newLocation);
        } else {
            System.out.println("Cannot add new location, max 5 can be selected");
        }
        this.tourismLocationSelected = list.toArray(new String[list.size()]);
    }

    public void removeTouristLocation(String removeLocation) {
        List<String> list = new ArrayList<String>(Arrays.asList(this.tourismLocationSelected));
        if (list.size() > 1) {
            list.remove(removeLocation);
        } else {
            System.out.println("No Locations to remove");
        }
        this.tourismLocationSelected = list.toArray(new String[list.size()]);
    }
}
