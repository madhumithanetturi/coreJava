package com.neoteric.Iterator;

import java.util.*;

public class Booking {

    public static void main (String[] args) {

        Map<String, FlightTicketBookings> flightTicketBooking = new HashMap<>();

        FlightTicketBookings ticket1 = new FlightTicketBookings("madhumitha", "45", "9701061849", 1999.0, new Date(), "hyderbad", "vijaywada");
        FlightTicketBookings ticket2 = new FlightTicketBookings("keerthi", "79", "7995179127", 15000.0, new Date(), "hyderabad", "usa");
        FlightTicketBookings ticket3 = new FlightTicketBookings("tharun", "90", "1234567890", 10000.0, new Date(), "hyderabad", "tamilNadu");
        FlightTicketBookings ticket4 = new FlightTicketBookings("rakesh", "57", "2345678901", 5000.0, new Date(), "hyderabad", "delhi");
        FlightTicketBookings ticket5 = new FlightTicketBookings("arun", "89", "3456789012", 50000.0, new Date(), "hyderabad", "korea");

        flightTicketBooking.put(ticket1.getToDestination(), ticket1);
        flightTicketBooking.put(ticket2.getToDestination(), ticket2);
        flightTicketBooking.put(ticket3.getToDestination(), ticket3);
        flightTicketBooking.put(ticket4.getToDestination(), ticket4);
        flightTicketBooking.put(ticket5.getToDestination(), ticket5);

//        Set<Map.Entry<String, FlightTicketBookings>> entrySet = flightTicketBooking.entrySet();
//        Iterator<Map.Entry<String, FlightTicketBookings>> entryIterator = entrySet.iterator();
//        for (; entryIterator.hasNext(); ) {
//
//            Map.Entry<String, FlightTicketBookings> user = entryIterator.next();
//            System.out.println(" flightBooking " + user.getKey() + " " + user.getValue().getName());

            TreeMap<String, FlightTicketBookings> ticketBookingsTreeMap = new TreeMap<>(flightTicketBooking);
            Set<Map.Entry<String, FlightTicketBookings>> entries = ticketBookingsTreeMap.entrySet();
            Iterator<Map.Entry<String, FlightTicketBookings>> iterator = entries.iterator();
            for (; iterator.hasNext(); ) {

                Map.Entry<String, FlightTicketBookings> bookingsEntry = iterator.next();
                System.out.println(" flightBooking " + bookingsEntry.getKey()+ " " + bookingsEntry.getValue());
            }

        }


    }
//}
