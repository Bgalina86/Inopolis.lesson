package Homework6Collection.Tassk_4_CompanyMovie;
/**
 * Вложенный список
 * ●создайте класс Company(кинокомпания)
 * ●в классе создайте поля:
 * ○название
 * ○ год основания
 * ○список фильмов,которые компания выпустила(по3штуки)
 * ●создайте в другом классе метод psvm.
 * ●в этом методе объявите список companies
 * ●положите в список 3 кинокомпании
 * ●каждой кинокомпании запишите в портфолиопо 3 фильма
 * ●напечатайте информацию о всех компаниях в формате
 * {названиекомпании}:{названиявсехфильмов}
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4NestedList {

    public static void main(String[] args) {
        Company company1 = new Company(
            "TVT", "1955");
        Company company2 = new Company(
            "BBC", "1940");
        Company company3 = new Company(
            "DV", "1985");

        Map<Company, Integer> filmsByCompany = new HashMap<>();
       filmsByCompany.put(company1,100);
        filmsByCompany.put(company2,150);
        filmsByCompany.put(company3,50);

        //Добавление фильмов в ком
        List<Film> companies = new ArrayList<>();
        company1.addFilm(new Film("Лёд 1", 8.5, "спорт", "Россия", true, 1970));
        company1.addFilm(new Film("Лёд 2", 8.5, "спорт", "Россия", true, 1975));
        company1.addFilm(new Film("Лёд 3", 8.5, "спорт", "Россия", true, 1980));
        company2.addFilm(
            new Film("Министерство неджентльменских дел 1", 6.5, "боевик", "США", false, 1971));
        company2.addFilm(
            new Film("Министерство неджентльменских дел 2", 6.5, "боевик", "США", false, 1976));
        company2.addFilm(
            new Film("Министерство неджентльменских дел 3", 6.5, "боевик", "США", false, 1989));
        company3.addFilm(new Film("Онегин 1", 9.5, "мелодрама", "Россия", true, 1990));
        company3.addFilm(new Film("Онегин 2", 9.5, "мелодрама", "Россия", true, 1997));
        company3.addFilm(new Film("Онегин 3", 9.5, "мелодрама", "Россия", true, 1999));

        System.out.println(company1);
        System.out.println(company2);
        System.out.println(company3);
    }
}
