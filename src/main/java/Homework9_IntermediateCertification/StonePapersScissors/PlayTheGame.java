package Homework9_IntermediateCertification.StonePapersScissors;

import java.io.IOException;

public class PlayTheGame {

    public static void main(String[] args) throws IOException {

        String userChar, computerChar;
        int userScore = 0, computerScore = 0;
        String roundResult;

        //Организация цикла на 5 раундов
        for (int round = 1; round <= 5; round++) {
            System.out.println("\nРаунд " + round);
            System.out.println("Ваш ход: (К)амень, (Н)ожницы, (Б)умага");
            StonePaperScissors newRound = new StonePaperScissors();

            userChar = newRound.getUserChar();
            computerChar = newRound.getComputerChar();

            System.out.println("Вы выбрали: " + userChar);
            System.out.println("Компьютер выбрал: " + computerChar);

            roundResult = newRound.getRoundWinner(userChar, computerChar);

            switch (roundResult) {
                case "user": {
                    userScore = userScore + newRound.getScore(userChar);
                    break;
                }
                case "computer": {
                    computerScore = computerScore + newRound.getScore(computerChar);
                    break;
                }
                default:
                    break;
            }//Печатаем итог после каждого раунда
            System.out.println("Результат раунда: " + roundResult);
            System.out.println("У пользователя: " + userScore);
            System.out.println("У компьютера: " + computerScore);
        }

        // Выводим итоговый результат
        System.out.println("\nИтоговый счет:");
        System.out.println("Вы: " + userScore + " очков");
        System.out.println("Компьютер: " + computerScore + " очков");

        // Определяем победителя по итогу 5 раундов
        if (userScore > computerScore) {
            System.out.println("Вы победили в игре!");
        } else if (computerScore > userScore) {
            System.out.println("Вы проиграли в игре.");
        } else {
            System.out.println("Ничья!");
        }
    }
}