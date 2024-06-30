package Homework8;

import java.util.Collection;
// управляющий файл для всех типов файлов
public class TaskClass  {
    public static void main(String[] args) {

        PlayerService service = new PlayerService() {
            @Override
            public Player getPlayerById(int id) {
                return null;
            }

            @Override
            public Collection<Player> getPlayers() {
                return null;
            }

            @Override
            public int createPlayer(String nickname) {
                return 0;
            }

            @Override
            public Player deletePlayer(int id) {
                return null;
            }

            @Override
            public int addPoints(int playerId, int points) {
                return 0;
            }
        };

        int playerId = service.createPlayer("WinMaster_777");
        service.addPoints(playerId, 100);

        Collection<Player> players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }

    }
}
