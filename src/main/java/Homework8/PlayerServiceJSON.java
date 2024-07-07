package Homework8;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


// обработка файла
public class PlayerServiceJSON implements PlayerService {

    int i = 0;
    private Path filePath = Path.of("src/main/java/Homework8/resources/logDeleteJSON.json");
    private Path listFilePath = Path.of("src/main/java/Homework8/resources/PlayerServiceNew.json");
    private List<Player> playerList = new ArrayList();


    @Override
    public int createPlayer(String nickname) throws IOException {
        Player newPlayer = new Player(i, nickname, 0, true);
        this.playerList.add(newPlayer);
        i++;
        return i;
    }

    @Override
    public Player getPlayerById(int id) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Player> allPlayers = readPlayersFromFile();
        for (Player currentPlayer : allPlayers) {
            if (currentPlayer.getId() == id) {
                System.out.println("\nИгрок с id = " + id);
                System.out.println(currentPlayer);
                mapper.writeValue(filePath.toFile(), currentPlayer);
                return currentPlayer;
            }
        }
        return null;
    }

    @Override
    public List<Player> getPlayers() throws IOException {
        return this.playerList;
    }

    @Override
    public Player deletePlayer(int playerId) throws IOException {
        List<Player> allPlayers = readPlayersFromFile();
        int idInList = 0;
        for (Player currentPlayer : allPlayers) {
            if (currentPlayer.getId() == playerId) {
                idInList = currentPlayer.getId();
            }
        }
        allPlayers.remove(allPlayers.get(idInList));
        writePlayersToFile(allPlayers);
        return null;
    }

    @Override
    public int addPoints(int playerId, int points) throws IOException {
        List<Player> allPlayers = readPlayersFromFile();
        for (Player currentPlayer : allPlayers) {
            if (currentPlayer.getId() == playerId) {
                currentPlayer.setPoints(points);
            }
        }
        writePlayersToFile(allPlayers);
        return 0;
    }

    public void writePlayersToFile(List<Player> players) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(listFilePath.toFile(), players);
    }

    public List<Player> readPlayersFromFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Player> fromPlayersFile = mapper.readValue(listFilePath.toFile(),
            new TypeReference<>() {
            });
        return fromPlayersFile;
    }

    public List<Player> printPlayersFromFile(List<Player> playersToPrint) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<Player> fromPlayersFile = mapper.readValue(listFilePath.toFile(),
            new TypeReference<>() {
            });
        for (Player currentPlayer : fromPlayersFile) {
            System.out.println(currentPlayer);
        }
        return null;
    }

    @Override
    public int addPlayer(String name) {
        return 0;
    }

    @Override
    public String removePlayer(int id) {
        return null;
    }

    @Override
    public List<String> getLeaderBoard() {
        return null;
    }
}