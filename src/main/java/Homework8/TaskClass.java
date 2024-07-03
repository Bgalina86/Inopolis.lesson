package Homework8;

import jakarta.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

// управляющий файл для всех типов файлов
public class TaskClass {

    public static void main(String[] args) throws IOException, JAXBException {
        int playerId;
        List<String> myPlayersList = List.of("Platinum", "Live545", "Strit34", "Tarakan33", "Ula67",
            "Super67", "Ice66");
        PlayerService serviceJson = new PlayerServiceJSON();

        for (String nickname : myPlayersList) {
            serviceJson.createPlayer(nickname);
        }
        serviceJson.writePlayersToFile(serviceJson.getPlayers());
        System.out.print("Начальный список игроков из json файла: \n");
        serviceJson.printPlayersFromFile(serviceJson.getPlayers());

        //удаление игрока по его id
        playerId = 1;
        serviceJson.deletePlayer(playerId);
        System.out.println("\nИгрок с id = " + playerId + " удален");
        serviceJson.printPlayersFromFile(serviceJson.getPlayers());
        //добавление очков по id игрока
        playerId = 3;
        serviceJson.addPoints(playerId, 5);
        System.out.println("\nИгроку с id = " + playerId + " добавлены очки");
        serviceJson.printPlayersFromFile(serviceJson.getPlayers());
        //получение игрока по его id
        playerId = 2;
        serviceJson.getPlayerById(playerId);
        System.out.print("\nИтоговый список игроков из json файла: \n");
        serviceJson.printPlayersFromFile(serviceJson.getPlayers());


        PlayerService serviceXml = new PlayerServiceXML();

        for(String nickname:myPlayersList){
        serviceXml.createPlayer(nickname);
    }
        serviceXml.writePlayersToFile(serviceXml.getPlayers());
        System.out.print("\n\nНачальный список игроков из xml файла: \n");
        serviceXml.printPlayersFromFile(serviceXml.getPlayers());

    //удаление игрока по его id
    playerId = 2;
        serviceXml.deletePlayer(playerId);
        serviceXml.printPlayersFromFile(serviceXml.getPlayers());

    //получение игрока по его id;
    playerId = 1;
        serviceXml.getPlayerById(playerId);
        serviceXml.printPlayersFromFile(serviceXml.getPlayers());

    //добавление очков по id игрока
    playerId = 4;
        serviceXml.addPoints(playerId, 5);
        System.out.println("\nИгроку с id = " + playerId + " добавлены очки");
        System.out.print("\nИтоговый список игроков из xml файла: \n");
        serviceXml.printPlayersFromFile(serviceXml.getPlayers());


    }
}
