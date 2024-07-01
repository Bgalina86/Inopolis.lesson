package Homework8;

import Homework8.proba.PlayerServiceJSON;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

// управляющий файл для всех типов файлов
public class TaskClass {

    public static void main(String[] args) throws IOException {
        int playerId;
        List<String> myPlayersList = List.of("Platinum", "Live545", "Strit34", "Tarakan33", "Ula67",
            "Super67", "Ice66");
        PlayerServiceJSON serviceJson = new PlayerServiceJSON();

        for (String nickname : myPlayersList) {
            serviceJson.createPlayer(nickname);
        }
        serviceJson.writePlayersToFile(serviceJson.getPlayers());
        System.out.print("Начальный список игроков из json файла: \n");
        serviceJson.printPlayersFromFile(serviceJson.getPlayers());

        //удаление игрока по его id
        playerId = 5;
        serviceJson.deletePlayer(playerId);
        System.out.println("\nИгрок с id = " + playerId + " удален");

        //добавление очков по id игрока
        playerId = 3;
        serviceJson.addPoints(playerId, 5);
        System.out.println("\nИгроку с id = " + playerId + " добавлены очки");

        //получение игрока по его id
        playerId = 2;
        serviceJson.getPlayerById(playerId);
        System.out.print("\nИтоговый список игроков из json файла: \n");
        serviceJson.printPlayersFromFile(serviceJson.getPlayers());
    }
}
