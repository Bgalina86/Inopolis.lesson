package Homework6.CompanyMovie;

import java.util.Objects;

public class Film {
    private String name;
    private double rating;
    private String genre;
    private String country;
    private boolean oskar;
    private int year;

    public Film(String name, double rating, String genre, String country, boolean oskar, int year) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.oskar = oskar;
        this.year = year;
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
        Film film = (Film) o;
        return Double.compare(film.rating, rating) == 0 && oskar == film.oskar
            && year == film.year && Objects.equals(name, film.name)
            && Objects.equals(genre, film.genre) && Objects.equals(country,
            film.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, genre, country, oskar, year);
    }

    @Override
    public String toString() {
        return "Film{" +
            "name='" + name + '\'' +
            ", rating=" + rating +
            ", genre='" + genre + '\'' +
            ", country='" + country + '\'' +
            ", oskar=" + oskar +
            ", year=" + year +
            '}';
    }
}
