package com.pluralsight;

import java.util.Scanner;

public class TheatreReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for name, date, and tickets
        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine();

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String showDate = scanner.nextLine();

        System.out.println("How many tickets would you like? ");
        int numTickets = scanner.nextInt();

// Split the full name into last name and first name
        String[] nameParts = fullName.trim().split("\\s+");
        String firstName = nameParts[0];
        String lastname = nameParts.length > 1 ? nameParts[1] : "";

        // Determine pluralization for the word "ticket"
        String ticketWord = (numTickets == 1) ? "ticket" : "tickets";

        // Display confirmation message
        System.out.println(numTickets + "" + ticketWord + " reserved for " + showDate + " under " + lastname + ", " + firstName);

    }

}
