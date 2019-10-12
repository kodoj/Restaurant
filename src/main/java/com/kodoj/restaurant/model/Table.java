package com.kodoj.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Table {

    int tableNumber;
    int seats;
    boolean reservation;
    String reservatedFor;
    Data reservationFrom;
    Data reservationUntil;

    public Table(int tableNumber, int seats) {
        this.tableNumber = tableNumber;
        this.seats = seats;
    }
}
