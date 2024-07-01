package Homework8;

import Homework8.proba.Player;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

// обработка файла
public class PlayerServiceJSON implements PlayerService{

    Path filePath = Path.of("src/main/java/Homework8/recurs/PlayerService1.json");
    Path listFilePath = Path.of("src/main/java/Homework8/recurs/PlayerServiceNew.json");
    // mapper.writeValue(filePath.toFile(), PlayerService1);//запись в файл
    // получить игрока по id
    public Homework8.Player getPlayerById(int id) {

        // mapper.writeValue(filePath.toFile(), PlayerService1);//запись в файл
        return null;
    }


    // получить список игроков
    public List<Homework8.Player> getPlayers() {
        // mapper.writeValue(filePath.toFile(), PlayerService1);//запись в файл

        return null;
    }


    // создать игрока (возвращает id нового игрока)
    public int createPlayer(String nickname) {

        // mapper.writeValue(filePath.toFile(), PlayerService1);//запись в файл
        return 0;
    }

    @Override
    public void writePlayersToFile(List<Homework8.Player> players) throws IOException {

    }

    @Override
    public List<Homework8.Player> readPlayersFromFile() throws IOException {
        return null;
    }

    // удалить игрока по id'шнику, вернет удаленного игрока
    public Homework8.Player deletePlayer(int id) {

        // mapper.writeValue(filePath.toFile(), PlayerService1);//запись в файл
        return null;
    }

    // добавить очков игроку. Возвращает обновленный счет
    public int addPoints(int playerId, int points) {

        // mapper.writeValue(filePath.toFile(), PlayerService1);//запись в файл
        return 0;
    }

    @Override
    public List<Homework8.Player> printPlayersFromFile(List<Homework8.Player> playersToPrint)
        throws IOException {
        return null;
    }

}
