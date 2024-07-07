package HomeworkTest8File;

import Homework8.PlayerService;
import Homework8.PlayerServiceJSON;
import Homework8.PlayerServiceXML;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DataHelper {

    public static void main(String[] args) {
        PlayerServiceJSON serviceJSON = new PlayerServiceJSON();
        PlayerServiceXML serviceXML = new PlayerServiceXML();

        PlayerService playerServiceJSON = new PlayerServiceJSON();
        PlayerService playerServiceXML= new PlayerServiceXML();
//    DbHelper dbH = new DbHelper();
//    DataHelper dataHelper = new DbHelper();


        System.out.println("Укажите источник: ");
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();

        PlayerService dh = null;

        if (source.startsWith("x")){
            dh = new PlayerServiceXML();
        }

        if (source.startsWith("j")){
            dh = new PlayerServiceJSON();
        }

     //   PlayerService playerService = new PlayerServiceImpl(dh);

//        String command = scanner.nextLine();
//
//        if (command.equalsIgnoreCase("leaderboard")){
//            List<String> leaderBoard = playerService.getLeaderBoard();
//            /// как вывести в консоль игроков
//
//        }
    }


      public void save(List<String> storage) {
    }

    public List<String> load() {
        return Collections.singletonList("");
    }
}
