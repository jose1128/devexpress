package com.devexpress.reto.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculateDays {

    public static int forReservation(String checkIn, String checkOut, int price) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate checkInDate = LocalDate.parse(checkIn, format);
        LocalDate checkOutDate = LocalDate.parse(checkOut, format);

        int checkInDay = checkInDate.getDayOfMonth() - 1;

        int differenceDays = checkOutDate.getDayOfMonth() - checkInDay;
        return differenceDays * price;
    }
}
