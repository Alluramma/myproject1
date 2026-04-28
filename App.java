package com.example.bookmyshow;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        BookingService service = new BookingService();

        Movie movie1 = new Movie("RRR", "Action");
        Movie movie2 = new Movie("Inception", "Sci-Fi");

        Show show1 = new Show(movie1, "10:00 AM", 5);
        Show show2 = new Show(movie2, "6:00 PM", 5);

        service.addShow(show1);
        service.addShow(show2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAvailable Shows:");
            service.displayShows();

            System.out.print("Select show index (-1 to exit): ");
            int showIndex = scanner.nextInt();

            if (showIndex == -1) break;

            Show selectedShow = service.getShow(showIndex);
            if (selectedShow == null) {
                System.out.println("Invalid show.");
                continue;
            }

            selectedShow.displaySeats();

            System.out.print("Enter seat number to book: ");
            int seatNumber = scanner.nextInt();

            if (selectedShow.bookSeat(seatNumber)) {
                System.out.println("Booking successful!");
            } else {
                System.out.println("Seat already booked or invalid.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using BookMyShow!");
    }
}
