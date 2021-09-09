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

    public Ticket(Passenger p, Flight f, String tSource, String tDestination, String tDeparatureTime,
                  String tArrivalTime, String tSeatNumber, String tStatus, String tPrice) {
        this.flight = f;
        this.passenger = p;
        this.tPnrNumber = "INDTKT00" + Integer.toString(++pnrCounter);
        this.tSource = tSource;
        this.tDestination = tDestination;
        this.tArrivalTime = tArrivalTime;
        this.tDeparatureTime = tDeparatureTime;
        this.tSeatNumber = tSeatNumber;
        this.tStatus = tStatus;
        this.tPrice = tPrice;
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
        return this.tArrivalTime;
    }

    public void setArrivalTime(String tArrivalTime) {
        this.tArrivalTime = tArrivalTime;
    }

    public String getDeparatureTime() {
        return this.tDeparatureTime;
    }

    public void settDeparatureTime(String tDeparatureTime) {
        this.tDeparatureTime = tDeparatureTime;
    }

    public String getPassengerContact() {
        return passenger.getContactDetails();
    }

    public Passenger getPassenger() {
        return this.passenger;
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

    public String checkStatus() {
        return this.tStatus;
    }

    public String getPrice() {
        return tPrice;
    }

    public void settPrice(String tPrice) {
        this.tPrice = tPrice;
    }

    public int getDuration() {
        String[] splitDeparture = this.tDeparatureTime.split(":");
        String depHoursString = splitDeparture[0];
        String depMinutesString = splitDeparture[1];
        int depHours = Integer.parseInt(depHoursString);
        int depMinutes = Integer.parseInt(depMinutesString);

        String[] splitArrival = this.tArrivalTime.split(":");
        String arrHoursString = splitArrival[0];
        String arrMinutesString = splitArrival[1];
        int arrHours = Integer.parseInt(arrHoursString);
        int arrMinutes = Integer.parseInt(arrMinutesString);

        if (arrMinutes < depMinutes) {
            arrHours--;
            arrMinutes = arrMinutes + 60;
        }

        int diffInMinutes = ((arrHours - depHours) * 60) + (arrMinutes - depMinutes);

        return diffInMinutes;
    }

    public void cancelTicket() {
        this.tStatus = "Cancelled";
    }
}