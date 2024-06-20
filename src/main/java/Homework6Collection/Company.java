package Homework6Collection;

import java.util.List;
import java.util.Objects;

public class Company {

    private String name;
    private String year;
    private List<String> films;

    public Company(String name)
    {
        this.name = name;
    }

    public Company(String title, List<String> movies)
    {
        name = title;
        films = movies;
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

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
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
            company.year) && Objects.equals(films, company.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, films);
    }

    @Override
    public String toString() {
        return "Company{" +
            "name='" + name + '\'' +
            ", year='" + year + '\'' +
            ", films=" + films +
            '}';
    }
}
