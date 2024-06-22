package Homework6Collection.Task_6_Sort;
/**
 * . Турнирная таблица ● В задании 1 вы создали класс Player ● Создайте Map<Player, Integer> points
 * для хранения очков игроков ● Положите в мэпу 10 игроков. У каждого 0 очков. ● Игроку с id=4
 * запишите 10 очков ● Игроку с id=7 – 12 очков ● Игроку с id=8 – 11 очков ● Игроку с id=9 – 13
 * очков ● Игроку с id=10 – 5 очков ● Выведите на экран 3х лучших игроков турнира* ● На первом месте
 * должен быть игрок с максимальным результатом
 */

import Homework6Collection.Player;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Task6PlayersStoragePoint {

    public static void main(String[] args) {

        //Хранилище играков
        Map<Player, Integer> points = new HashMap<>();
        points.put(new Player(1, "Alex", true), 0);
        points.put(new Player(2, "Alen", true), 0);
        points.put(new Player(3, "Anton", true), 0);
        points.put(new Player(4, "Piter", true), 0);
        points.put(new Player(5, "Tone", true), 0);
        points.put(new Player(6, "Fill", true), 0);
        points.put(new Player(7, "Macks", true), 0);
        points.put(new Player(8, "Milena", true), 0);
        points.put(new Player(9, "Pati", true), 0);
        points.put(new Player(10, "Lili", true), 0);

        //Назначение игрокам очков
        points.put(new Player(4, "Piter", true), 10);
        points.put(new Player(7, "Macks", true), 12);
        points.put(new Player(8, "Milena", true), 11);
        points.put(new Player(9, "Pati", true), 13);
        points.put(new Player(10, "Lili", true), 5);

        //Печать всех играков с очками
        //System.out.println(points);

        //Организация сортировки MAP
        //Запись в новую карту отсортированных данных. Результаты собрали в LinkedHashMap
        Map<Player, Integer> sortedMap1 = points.entrySet().stream()
            .sorted(Entry.comparingByValue())
            .collect(Collectors.toMap(
                Entry::getKey,
                Entry::getValue,
                (a, b) -> a,
                LinkedHashMap::new));
        //Печать новой карты
        //System.out.println(sortedMap1);

        //Переход к TreeMap
        Map<Player, Integer> sortedMap2 = new TreeMap<Player, Integer>(
            Comparator.comparing(points::get));
        sortedMap2.putAll(points);

        // Преобразуем список к Array
        List<Entry<Player, Integer>> list = new ArrayList<>(sortedMap2.entrySet());
        var listArray = list.toArray();
        for (var listen : listArray) {
        }
        for (int i = list.size() - 1; i > list.size() - 4; i = i - 1) {
            System.out.println(list.get(i) + "\n");
        }
    }
}

