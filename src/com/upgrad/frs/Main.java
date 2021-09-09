package com.upgrad.frs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] tourismLocations = {"Ghat", "Caves"};

        Passenger p1 = new Passenger("Shivanagar", "Warangal", "Telangana",
                "Sanjuna", "123", "sanjuna@a.com");

        Passenger p2 = new Passenger("Hanamkonda", "Kazipet", "Telangana",
                "Harvi", "456", "harvi@a.com");

        Flight flight = new Flight(101, 9, 50, "Indigo");

        RegularTicket regularTkt = new RegularTicket(p1, flight,
                "Hyderabad", "Delhi", "12:40", "13:10",
                "A101", "Confirmed", "1000", "Snacks");

        TouristTicket touristTkt = new TouristTicket(p2, flight,
                "Hyderabad", "Shimla", "14:50", "15:40",
                "A101", "Confirmed", "1000", "Dandeli, Shimla", tourismLocations);

        //Print regular ticket details
        printTicketDetails(regularTkt);

        //Print tourist ticket details
        printTicketDetails(touristTkt);
    }

    public static void printTicketDetails(Ticket tkt) {
        // Update passenger contact details
        tkt.getPassenger().updateContactDetails("Anil", "999", "anil@a.com");

        // Update passenger address details
        tkt.getPassenger().updateAddressDetails("Madeenaguda", "Hyderabad", "AP");

        //Get PNR Number
        System.out.println("PNR Number: " + tkt.getPnrNumber());

        //Get PassengerID, contact & address details
        System.out.println("Passenger ID: " + tkt.getPassengerId());
        System.out.println("Passenger Contact Details: " + tkt.getPassengerContact());
        System.out.println("Passenger Address Details: " + tkt.getPassengerAddress());

        //Get Flight Details
        System.out.println(tkt.getFlight().getFlightDetails());
        System.out.println("Flight Number: " + tkt.getFlight().getFlightNumber());
        System.out.println("Airline Name: " + tkt.getFlight().getAirlineName());
        System.out.println("Seat booked in flight: " + tkt.getFlight().getSeatsBooked());
        System.out.println("Flight Capacity: " + tkt.getFlight().getFlightCapacity());

        //Check seat availability
        System.out.println("Available Seats: " + tkt.getFlight().getAvailableSeats());

        //Update seats availability
        System.out.println("Available Seats after update: " + tkt.getFlight().updateSeatsAvailability(50, 12));

        //Check ticket status
        System.out.println("Ticket status: " + tkt.checkStatus());

        //Cancel Ticket and check status again
        tkt.cancelTicket();
        System.out.println("Ticket status after cancellation: " + tkt.checkStatus());

        //Check travel duration on booked ticket
        System.out.println("Flight Duration(in minutes): " + tkt.getDuration());

        if (tkt instanceof TouristTicket) {
            //Remove tourist location
            ((TouristTicket) tkt).removeTouristLocation("Ghat");

            //Add tourist location
            ((TouristTicket) tkt).addTouristLocation("Delhi");

            //Get tourist location
            System.out.println("Tourist Locations Selected: " + Arrays.toString(((TouristTicket) tkt).getTourismLocationSelected()));

            //Get hotel address
            System.out.println("Hotel Address: " + ((TouristTicket) tkt).getHotelAddress());
        }

        if (tkt instanceof RegularTicket) {
            System.out.println("Special Services Availed: " + ((RegularTicket) tkt).getSpecialService());
        }

        System.out.println("Is seat available: " + tkt.getFlight().isSeatAvailable());
    }
}