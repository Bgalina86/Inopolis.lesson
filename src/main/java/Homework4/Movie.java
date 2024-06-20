package Homework4;

import java.util.SplittableRandom;

public class Movie {

    String name;
    double rating;
    String genre;
    String country;
    boolean oskar;
    int year;

    public Movie(String name, double rating, String genre, String country, boolean oskar) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.oskar = oskar;
    }
}
