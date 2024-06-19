package Homework6.CompanyMovie;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Company {

    private String name;
    private String year;
    private List<Film> filmsList;

    public Company(String name, String year)
    {
        this.name = name;
        this.year=year;
        this.filmsList=new ArrayList<>();
    }

    public String getName(String s) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<Film> getFilms() {
        return filmsList;
    }


    public void addFilm(Film film){
        this.filmsList.add(film);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(year,
            company.year) && Objects.equals(filmsList, company.filmsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, filmsList);
    }

    @Override
    public String toString() {
        return "Company{" +
            "name='" + name + '\'' +
            ", year='" + year + '\'' +
            ", filmList=" + filmsList +
            '}';
    }
}
