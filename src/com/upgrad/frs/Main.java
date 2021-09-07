package com.upgrad.frs;

public class Main {
    public static void main(String[] args) {
        String[] tourismLocations = {"Ghat", "Caves"};

        Passenger p = new Passenger("Shivanagar", "Warangal", "Telangana",
                                    "Sanjuna", "123", "aa@a.com");

        RegularTicket rt = new RegularTicket(p, 111, 9, 50, "Indigo",
                "Hyderabad", "Delhi", "14:50", "12:40",
                "A101", "Confirmed", "1000", "Snacks");

        TouristTicket tt = new TouristTicket(p, 111, 9, 50, "Indigo",
                "Hyderabad", "Delhi", "14:50", "12:40",
                "A101", "Confirmed", "1000", "Shimla", tourismLocations);

        p.updateContactDetails("Anil","999", "anil@com");
        p.updateAddressDetails("RTC", "Hyd", "AP");
        printTicketDetails(rt);
        printTicketDetails(tt);
    }

    public static void printTicketDetails(Ticket tkt){
     System.out.println(tkt.getPnrNumber());
     System.out.println(tkt.getPassengerId());
     System.out.println(tkt.getPassengerContact());
     System.out.println(tkt.getPassengerAddress());
    }
}