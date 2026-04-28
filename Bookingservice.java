package com.example.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Show> shows = new ArrayList<>();

    public void addShow(Show show) {
        shows.add(show);
    }

    public void displayShows() {
        for (int i = 0; i < shows.size(); i++) {
            Show show = shows.get(i);
            System.out.println(i + ". " + show.getMovie().getName() + " at " + show.getTime());
        }
    }

    public Show getShow(int index) {
        if (index >= 0 && index < shows.size()) {
            return shows.get(index);
        }
        return null;
    }
}
