package Homework6Collection;
/**
 * Турнир игроков ●В задании 1 высоздали класс Player ●Создайте хранилище игроков.Его будет
 * использовать программа, которая описывает турнир. Требования: ○Количество игроков не известно
 * заранее. Может быть 2,а может 100 ○В турнир каждый игрок может записаться только 1 раз(не может
 * быть дублей) ● создайте 10 игроков и поместите их в хранилище. ●убедитесь, что если один игрок
 * помещен в хранилище дважды, дубликат не запишется
 */

import java.util.HashMap;
import java.util.Map;

public class Task5PlayerStorage {

    private Map<Integer, Player> _players;

    public Task5PlayerStorage() {
        _players = new HashMap();
    }

    //Сообщение о дубликате
    public void addPlayer(int code, Player player) {
        if (_players.containsKey(code)) {
            System.out.println("Player already exists");
            return;
        }
        _players.put(code, player);
    }

    //Класс для печати
    public void showAllPlayers() {
        System.out.println(_players);
    }

    //Класс список игроков
    public static void main(String[] args) {
        Task5PlayerStorage playerStorage = new Task5PlayerStorage();

        //Список игроков
        playerStorage.addPlayer(0, new Player(0, "Alex", true));
        playerStorage.addPlayer(1, new Player(1, "Alen", true));
        playerStorage.addPlayer(2, new Player(2, "Anton", true));
        playerStorage.addPlayer(3, new Player(3, "Piter", true));
        playerStorage.addPlayer(4, new Player(4, "Tone", true));
        playerStorage.addPlayer(5, new Player(5, "Fill", true));
        playerStorage.addPlayer(6, new Player(6, "Macks", true));
        playerStorage.addPlayer(7, new Player(7, "Milena", true));
        playerStorage.addPlayer(8, new Player(8, "Pati", true));
        playerStorage.addPlayer(9, new Player(9, "Lili", true));
        playerStorage.addPlayer(7, new Player(7, "Milena", true));// error, duplicate player

        //Вывод на экран
        playerStorage.showAllPlayers();
    }
}
