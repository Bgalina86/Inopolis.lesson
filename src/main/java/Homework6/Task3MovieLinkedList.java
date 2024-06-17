package Homework6;

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
