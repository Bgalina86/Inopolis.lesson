package Homework8;

import java.nio.file.Path;
import java.util.Collection;
// обработка файла
public class PlayerServiceJSON implements PlayerService{

    Path filePath = Path.of("src/main/java/Homework8/recurs/PlayerService1.json");
    Path listFilePath = Path.of("src/main/java/Homework8/recurs/PlayerServiceNew.json");
    // mapper.writeValue(filePath.toFile(), PlayerService1);//запись в файл
    // получить игрока по id
    public Player getPlayerById(int id) {
        return null;
    }

    // получить список игроков
    public Collection<Player> getPlayers() {
        return null;
    }

    // создать игрока (возвращает id нового игрока)
    public int createPlayer(String nickname) {

        return 0;
    }

    // удалить игрока по id'шнику, вернет удаленного игрока
    public Player deletePlayer(int id) {
        return null;
    }

    // добавить очков игроку. Возвращает обновленный счет
    public int addPoints(int playerId, int points) {
        return 0;
    }

}
