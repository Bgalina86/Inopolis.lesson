package Homework6;
/**
 * Вложенный список
 * ●создайте класс Company(кинокомпания)
 * ●в классе создайте поля:
 * ○название
 * ○год основания
 * ○список фильмов,которые компания выпустила(по3штуки)
 * ●создайте в другом классе метод psvm.
 * ●в этом методе объявите список companies
 * ●положите в список 3 кинокомпании
 * ●каждой кинокомпании запишите в портфолиопо 3 фильма
 * ●напечатайте информацию о всех компаниях в формате
 * {названиекомпании}:{названиявсехфильмов}
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4NestedList2 {

    public static void main(String[] args)
    {
        HashMap<String, Company> companies = new HashMap<String, Company>();

        companies.put("TVT", new Company("TVT",   Arrays.asList(new String[]{"\"Лёд 1\"", "\"Лёд 2\"", "\"Лёд 3\""}) ));
        companies.put("CTC", new Company("CTC",   Arrays.asList(new String[]{"\"Министерство неджентльменских дел 1\"", "\"Министерство неджентльменских дел 2\"", "\"Министерство неджентльменских дел 3\""}) ));
        companies.put("BBC", new Company("BBC",   Arrays.asList(new String[]{"\"Онегин 1\"", "\"Онегин 2\"", "\"Онегин 3\""}) ));
        System.out.println(companies);


    }

}
