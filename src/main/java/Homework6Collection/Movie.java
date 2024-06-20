package Homework6Collection;

import java.util.List;
import java.util.Objects;

public class Movie {

    private String name;
    private double rating;
    private String genre;
    private String country;
    private boolean oskar;
    private int year;

    public Movie(String name, double rating, String genre, String country, boolean oskar) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.oskar = oskar;
    }

    public Movie(List<String> asList) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isOskar() {
        return oskar;
    }

    public void setOskar(boolean oskar) {
        this.oskar = oskar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Movie movie = (Movie) o;
        return Double.compare(movie.rating, rating) == 0 && oskar == movie.oskar
            && year == movie.year && Objects.equals(name, movie.name)
            && Objects.equals(genre, movie.genre) && Objects.equals(country,
            movie.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, genre, country, oskar, year);
    }

    @Override
    public String toString() {
        return "Movie{" +
            "name='" + name + '\'' +
            ", rating=" + rating +
            ", genre='" + genre + '\'' +
            ", country='" + country + '\'' +
            ", oskar=" + oskar +
            ", year=" + year +
            '}';
    }
}
