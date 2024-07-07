package Homework9_IntermediateCertification.StonePapersScissors;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StonePaperScissors {

    private String userChar;
    private String computerChar;

    public StonePaperScissors() {
    }

    //Начисляемые баллы при выигранной ситуации
    public int getScore(String input) {
        if (input.equals("К")) {
            return 1;
        } else if (input.equals("Н")) {
            return 2;
        } else {
            return 5;
        }

    }

    //Результат игры 1 раунда
    public String getRoundWinner(String userChar, String computerChar) {

        this.userChar = userChar;
        this.computerChar = computerChar;

        if (this.userChar.equals(computerChar)) {
            return "Ничья!";
        } else if ((this.userChar.equals("К") && this.computerChar.equals("Н") ||
            this.userChar.equals("Н") && this.computerChar.equals("Б") ||
            this.userChar.equals("Б") && this.computerChar.equals("К"))) {
            return "user";
        } else {
            return "computer";
        }
    }

    //Обработка вводимых значений
    public String getUserChar() {
        boolean hasRightLetter = false;
        do {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            // Паттерн для строки чисел, разделенных пробелом
            String pattern = "[КНБ]";

            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(input);

            if (m.matches()) {
                hasRightLetter = true;
                this.userChar = input;
            } else {
                System.out.println("Введите правильную букву:");
            }
        } while (!hasRightLetter);
        return this.userChar;
    }

    public void setUserChar(String userChar) {
        this.userChar = userChar;
    }

    //Организация вывода случайного значения игроком - компьютер
    public String getComputerChar() {
        Random random = new Random();
        char[] symbols = {'К', 'Н', 'Б'};
        int randomIndex = random.nextInt(symbols.length);
        this.computerChar = String.valueOf(symbols[randomIndex]);

        return computerChar;
    }

    public void setComputerChar(String computerChar) {
        this.computerChar = computerChar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StonePaperScissors that = (StonePaperScissors) o;
        return userChar == that.userChar && computerChar == that.computerChar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userChar, computerChar);
    }

    @Override
    public String toString() {
        return "stonePaperScissors{" +
            "userLetter=" + userChar +
            ", computerLetter=" + computerChar +
            '}';
    }
}