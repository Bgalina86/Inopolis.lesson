package Homework9_IntermediateCertification.StonePapersScissors;
/**
 * Камень-ножницы-бумага
 * Напишите консольное приложение, которое играет с пользователем в камень-ножницы-бумагу.
 *
 * Требования:
 * 1. Пользователь вводит значение через консоль
 *     К - камень
 *     Н - ножницы
 *     Б - бумага
 * 2. Программа выбирает свой вариант случайным образом
 * 3. Игра состоит из 5 раундов
 * 4. Баллы считаются по формуле ниже.
 * 5. По итогу 5 раундов, программа пишет счет и объявляет победителя. Конец игры.
 *
 * Как считать баллы:
 * 1. Если сторона одержала победу с помощью камня (К), победитель получает 1 балл
 * 2. Если сторона одержала победу с помощью ножниц (Н), победитель получает 2 балла
 * 3. Если сторона одержала победу с помощью бумаги (Б), победитель получает 5 баллов
 * Н - К -> К
 * К - Б -> Б
 * Н - Б -> Н
 */

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