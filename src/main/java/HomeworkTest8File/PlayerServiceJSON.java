//package HomeworkTest8File;
//
//
//import Homework8.Player;
//import Homework8.PlayerService;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import java.io.IOException;
//import java.nio.file.Path;
//import java.util.ArrayList;
//import java.util.List;
//
//
//// обработка файла
//public class PlayerServiceJSON extends DataHelper implements PlayerService {
//    int i = 0;
//    private Path filePath = Path.of("src/main/java/Homework8/recurs/logDeleteJSON.json");
//    private Path listFilePath = Path.of("src/main/java/Homework8/recurs/PlayerServiceNew.json");
//    private List<Homework8.Player> playerList = new ArrayList();
//
//
//    @Override
//    public int createPlayer(String nickname) throws IOException {
//        Homework8.Player newPlayer = new Homework8.Player(i, nickname, 0, true);
//        this.playerList.add(newPlayer);
//        i++;
//        return i;
//    }
//
//    @Override
//    public Homework8.Player getPlayerById(int id) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        List<Homework8.Player> allPlayers = readPlayersFromFile();
//        for (Homework8.Player currentPlayer : allPlayers) {
//            if (currentPlayer.getId() == id) {
//                System.out.println("\nИгрок с id = " + id);
//                System.out.println(currentPlayer);
//                mapper.writeValue(filePath.toFile(),currentPlayer);
//                return currentPlayer;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public List<Homework8.Player> getPlayers() throws IOException {
//        return this.playerList;
//    }
//
//    @Override
//    public Homework8.Player deletePlayer(int playerId) throws IOException {
//        List<Homework8.Player> allPlayers = readPlayersFromFile();
//        int idInList = 0;
//        for (Homework8.Player currentPlayer : allPlayers) {
//            if (currentPlayer.getId() == playerId) {
//                idInList = currentPlayer.getId();
//            }
//        }
//        allPlayers.remove(allPlayers.get(idInList));
//        writePlayersToFile(allPlayers);
//        return null;
//    }
//
//    @Override
//    public int addPoints(int playerId, int points) throws IOException {
//        List<Homework8.Player> allPlayers = readPlayersFromFile();
//        for (Homework8.Player currentPlayer : allPlayers) {
//            if (currentPlayer.getId() == playerId) {
//                currentPlayer.setPoints(points);
//            }
//        }
//        writePlayersToFile(allPlayers);
//        return 0;
//    }
//
//    public void writePlayersToFile(List<Homework8.Player> players) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(listFilePath.toFile(), players);
//    }
//
//    public List<Homework8.Player> readPlayersFromFile() throws IOException {
//       ObjectMapper mapper = new ObjectMapper();
//        List<Homework8.Player> fromPlayersFile = mapper.readValue(listFilePath.toFile(), new TypeReference<>() {});
//        return fromPlayersFile;
//    }
//
//    public List<Homework8.Player> printPlayersFromFile(List<Homework8.Player> playersToPrint) throws IOException{
//
//        ObjectMapper mapper = new ObjectMapper();
//        List<Homework8.Player> fromPlayersFile = mapper.readValue(listFilePath.toFile(), new TypeReference<>() {});
//        for (Player currentPlayer : fromPlayersFile) {
//            System.out.println(currentPlayer);
//        }
//        return null;
//    }
//
//
//
//}
