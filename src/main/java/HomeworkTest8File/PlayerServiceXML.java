package HomeworkTest8File;

public class PlayerServiceXML  {
//    private int i;
//    private Path filePath = Path.of("src/main/java/Homework8/recurs/logDeleteXML.xml");
//    private Path listFilePath = Path.of("src/main/java/Homework8/recurs/PlayerServiceNewXML.xml");
//    private List<Homework8.Player> playerList = new ArrayList();
//
//    @Override
//    public Homework8.Player getPlayerById(int id) throws IOException, JAXBException {
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
//        return  this.playerList;
//    }
//
//    @Override
//    public int createPlayer(String nickname) throws IOException {
//        Homework8.Player newPlayer = new Homework8.Player(i, nickname, 0, false);
//        this.playerList.add(newPlayer);
//        i++;
//        return i;
//    }
//
//    @Override
//    public Homework8.Player deletePlayer(int playerId) throws JAXBException {
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
//    @Override
//    public int addPoints(int playerId, int points) throws JAXBException {
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
//    @Override
//    public void writePlayersToFile(List<Homework8.Player> player) throws JAXBException {
//        Homework8.Players myPlayers = new Homework8.Players(player);
//        JAXBContext context = JAXBContext.newInstance(Homework8.Player.class, Homework8.Players.class);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.marshal(myPlayers, listFilePath.toFile());
//    }
//
//    @Override
//    public List<Homework8.Player> readPlayersFromFile() throws JAXBException {
//        JAXBContext context = JAXBContext.newInstance(Homework8.Player.class, Homework8.Players.class);
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        Homework8.Players unmarshalPlayers = (Homework8.Players) unmarshaller.unmarshal(listFilePath.toFile());
//        return unmarshalPlayers.getPlayerList();
//    }
//
//    @Override
//    public List<Homework8.Player> printPlayersFromFile(List<Homework8.Player> playersToPrint) throws JAXBException {
//        JAXBContext context = JAXBContext.newInstance(Homework8.Player.class, Homework8.Players.class);
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        Homework8.Players unmarshalPlayers = (Players) unmarshaller.unmarshal(listFilePath.toFile());
//        for (Player currentplayer:unmarshalPlayers.getPlayerList()){
//            System.out.println(currentplayer);
//        }
//        return null;
//    }
}