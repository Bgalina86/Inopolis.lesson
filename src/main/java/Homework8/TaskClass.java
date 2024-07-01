package Homework8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Scanner;

// управляющий файл для всех типов файлов
public class TaskClass {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("src/main/java/Homework8/recurs/counter.txt"); //1

        if (Files.exists(filePath)) {
            //1. Прочитать данные из файла
            String content = Files.readString(filePath);

//            //2. произвести действия с данными и файла
//            int value = Integer.parseInt(content); // "1" -> 1
//            value += 1;
//
//            //3. ответ записать в файл
//            String newContent = String.valueOf(value); // 2 -> "2"
//            Files.writeString(filePath, newContent);
//        } else {
//            Files.writeString(filePath, "0");
        }

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
