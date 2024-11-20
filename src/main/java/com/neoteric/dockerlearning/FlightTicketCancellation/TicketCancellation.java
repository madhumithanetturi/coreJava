package com.neoteric.dockerlearning.FlightTicketCancellation;

import java.util.Date;

public interface TicketCancellation {

    double refundforCancellation(Ticket ticket, Date cancelDate);
}
