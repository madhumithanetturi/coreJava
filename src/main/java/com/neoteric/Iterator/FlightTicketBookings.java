package com.neoteric.Iterator;

import java.util.Date;

public class FlightTicketBookings {

    private String name;

    private String age;

    private String mobileNumber;

    private Double amount;

    private Date date;

    private String fromDestination;

    private String toDestination;

    public FlightTicketBookings(String name, String age, String mobileNumber, Double amount, Date date, String fromDestination, String toDestination) {
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.date = date;
        this.fromDestination = fromDestination;
        this.toDestination = toDestination;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getFromDestination() {
        return fromDestination;
    }

    public String getToDestination() {
        return toDestination;
    }
}
