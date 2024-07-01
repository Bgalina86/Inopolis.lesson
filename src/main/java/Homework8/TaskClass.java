package Homework8;

import java.util.Collection;
import java.util.Scanner;

// управляющий файл для всех типов файлов
public class TaskClass {
    public static void main(String[] args) {
        PlayerServiceJSON playerServiceJSON = new PlayerServiceJSON();
        PlayerService service = new PlayerServiceJSON();
        System.out.println("Укажите источник: ");
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();

        PlayerService dh = null;

//        if (source.startsWith("x")){
//            dh = new XmlHelper();
//        }

        if (source.startsWith("j")){
            dh = new PlayerServiceJSON();
        }

//        if (source.startsWith("d")){
//            dh = new DbHelper();
//        }

        int playerId = service.createPlayer("WinMaster_777");
        service.addPoints(playerId, 100);

        Collection<Player> players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }

    }
}
