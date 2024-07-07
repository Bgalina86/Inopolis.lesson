package HomeworkTest8File;

import Homework8.Player;
import jakarta.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

public interface PlayerService {
    // получить игрока по id
    Homework8.Player getPlayerById(int id) throws IOException, JAXBException;

    // получить список игроков
    List<Homework8.Player> getPlayers() throws IOException;

    // создать игрока (возвращает id нового игрока)
    int createPlayer(String nickname) throws IOException;


    void writePlayersToFile(List<Homework8.Player> players) throws IOException, JAXBException;

    List<Homework8.Player> readPlayersFromFile() throws IOException, JAXBException;

    // удалить игрока по id'шнику, вернет удаленного игрока
    Homework8.Player deletePlayer(int id) throws IOException, JAXBException;

    // добавить очков игроку. Возвращает обновленный счет
    int addPoints(int playerId, int points) throws IOException, JAXBException;

    List <Homework8.Player> printPlayersFromFile (List<Player> playersToPrint) throws IOException, JAXBException;

    int addPlayer(String name);

    String removePlayer(int id);

    List<String> getLeaderBoard();
}