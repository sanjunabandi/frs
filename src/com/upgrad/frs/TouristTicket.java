package com.upgrad.frs;

public class TouristTicket {
    String hotelAddress;
    String[] tourismLocationSelected = new String[5];

    public TouristTicket(String hotelAddress, String[] tourismLocationSelected) {
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
