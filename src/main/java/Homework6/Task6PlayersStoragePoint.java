package Homework6;

import java.util.HashMap;
import java.util.Map;

public class Task6PlayersStoragePoint {

    private Map<Player,Integer> _players;

    public Task6PlayersStoragePoint() {
        _players = new HashMap();
    }

    public void addPlayer(int code, Player player) {
        if (_players.containsKey(code)) {
            System.out.println("Player already exists");
            return;
        }

        _players.put(player,code);
    }

    public void showAllPlayers() {
        System.out.println(_players);
    }


    public static void main(String[] args) {
        Task6PlayersStoragePoint playerStorage = new Task6PlayersStoragePoint();

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
        playerStorage.addPlayer(10, new Player(10, "Milena", true));

     

        playerStorage.showAllPlayers();

    }
}