package Homework6Collection;
/**
 * . Турнирная таблица ● В задании 1 вы создали класс Player ● Создайте Map<Player, Integer> points
 * для хранения очков игроков ● Положите в мэпу 10 игроков. У каждого 0 очков. ● Игроку с id=4
 * запишите 10 очков ● Игроку с id=7 – 12 очков ● Игроку с id=8 – 11 очков ● Игроку с id=9 – 13
 * очков ● Игроку с id=10 – 5 очков ● Выведите на экран 3х лучших игроков турнира* ● На первом месте
 * должен быть игрок с максимальным результатом
 */

import java.util.HashMap;
import java.util.Map;

public class Task6 {

    public static void main(String[] args) {
        Player player1 = new Player(1, "Alex", true);
        Player player2 = new Player(2, "Alen", true);
        Player player3 = new Player(3, "Anton", true);
        Player player4 = new Player(4, "Piter", true);
        Player player5 = new Player(5, "Tone", true);
        Player player6 = new Player(6, "Fill", true);
        Player player7 = new Player(7, "Macks", true);
        Player player8 = new Player(8, "Milena", true);
        Player player9 = new Player(9, "Pati", true);
        Player player10 = new Player(10, "Lili", true);

        Map<Player, Integer> playerIntegerMap = new HashMap<>();
        playerIntegerMap.put(player4, 10);
        playerIntegerMap.put(player7, 12);
        playerIntegerMap.put(player8, 11);
        playerIntegerMap.put(player9, 13);
        playerIntegerMap.put(player10, 5);
//сортировака по убыванию и вывод 3х первых

        System.out.println(playerIntegerMap);
    }
}
