package com.upgrad.frs;

public class RegularTicket {
    public RegularTicket(String specialService) {
        this.specialService = specialService;
    }

    String specialService;

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    public void specialServicesAvailed(String specialService) {

    }
}
