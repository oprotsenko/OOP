package com.oprotsen.JavaOOP.lesson5.AirlineTicket;

import java.time.LocalDate;

public class TicketRunner {
    public static void main(String[] args) { ;
        Ticket ticket = new Ticket(1000,
                new PassengerInfo("Olena", "Protsenko", "HU 134545"),
                new FlightInfo(111111, "Heathrow", "Borispol",
                        LocalDate.of(2018, 4, 15), 45, 150));
        VipTicket vipTicket = new VipTicket(1000,
                new PassengerInfo("Evhen", "Afanasov", "IJ094874"),
                new FlightInfo(111111, "Heathrow", "Borispol",
                        LocalDate.of(2018, 4, 15), 67, 200),
                new Baggage(2, 20), new Meal(TypeOfMeal.MEAT, Drink.YES));

        System.out.println(ticket.getCost());
        System.out.println(vipTicket.getCost());
    }
}
