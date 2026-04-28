package com.example.bookmyshow;

import java.util.Arrays;

public class Show {
    private Movie movie;
    private String time;
    private boolean[] seats;

    public Show(Movie movie, String time, int totalSeats) {
        this.movie = movie;
        this.time = time;
        this.seats = new boolean[totalSeats];
    }

    public void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + i + ": " + (seats[i] ? "Booked" : "Available"));
        }
    }

    public boolean bookSeat(int seatNumber) {
        if (seatNumber < 0 || seatNumber >= seats.length) {
            return false;
        }
        if (!seats[seatNumber]) {
            seats[seatNumber] = true;
            return true;
        }
        return false;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getTime() {
        return time;
    }
}
