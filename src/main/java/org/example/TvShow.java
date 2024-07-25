package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TvShow {
    private String name;
    private int numberOfEpisodes;
    private String genre;

    // Constructor to initialize name, numberOfEpisodes, and genre
    public TvShow(String name, int numberOfEpisodes, String genre) {
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for numberOfEpisodes
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // toString method to print TvShow details
    @Override
    public String toString() {
        return "The name of the show is " + getName() + " with " + getNumberOfEpisodes() + " number of episodes. The genre is " + getGenre() + ".";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();

        // Loop to get user input
        while (true) {
            System.out.print("Name of the show: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("How many episodes? ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.print("What is the genre? ");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(name, numberOfEpisodes, genre));
        }

        // Print all TV shows
        for (TvShow show : tvShows) {
            System.out.println(show);
        }
    }
}
