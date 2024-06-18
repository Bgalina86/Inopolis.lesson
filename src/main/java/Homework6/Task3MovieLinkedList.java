package Homework6;
/**
 * Список объектов
 * ●создайте класс Movie(можно использовать тот, что создавали ранее)
 * ●в классе создайте поля:
 * ○название
 * ○рейтинг(от0до10)
 * ○жанр
 * ○страна
 * ○есть ли оскар(да/нет)
 * ●создайте в другом классе метод psvm.
 * ●в этом методе объявите список films
 * ●положите в список 3 любимых фильма
 * ●выведите на экран информацию о фильме по индексу 1
 */

import java.util.LinkedList;
import java.util.List;

public class Task3MovieLinkedList {

    public static void main(String[] args) {
        List<Movie> films=new LinkedList<>();

        films.add(new Movie("\"Лёд 3\"", 2, "спорт", "Россия", true));
        films.add(new Movie("\"Министерство неджентльменских дел\"", 5, "боевик", "США", false));
        films.add(new Movie("\"Онегин\"", 1, "мелодрама", "Россия", true));

        System.out.println(films.get(1));

    }

}
