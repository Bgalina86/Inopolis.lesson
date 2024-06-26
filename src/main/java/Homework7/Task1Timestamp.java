package Homework7;
//Реализуйте интерфейс HumanReadableTimestamp ссылка. Напишите функцию,
//    которая принимает на вход отметку времени, а возвращает строку вида:
//    опубликовано X Y назад, где X - рассчитанный период, а Y – единица времени
//    (минуты|часы|дни)
//    Требования:
//    ● если публикация была меньше часа назад, написать один из вариантов:
//    ○ опубликовано X минут назад
//    ○ опубликовано X минуту назад (1, 21, 31, 41, 51 минуту назад)
//    ○ опубликовано X минуты назад (2, 3, 4, 22, 54 минуты назад)
//    ● если публикация была сделана меньше суток назад, написать один из
//    вариантов:
//    ○ опубликовано X часов назад
//    ○ опубликовано X час назад (1, 21 час назад)
//    ○ опубликовано X часа назад(2, 3, 4, 22, 23 часа назад)
//    ● если публикация была сделана 1 день назад, написать:
//    ○ опубликовано вчера
//    ● во всех остальных случаях, написать
//    ○ опубликовано X дней назад (5, 20, 99, 100, 111 дней назад)
//    ○ опубликовано X дня назад (2, 3, 4, 22, 23, 92 дня назад)
//    ○ опубликовано X день назад (1, 21, 31, 101 день назад)
//    Для самопроверки, можно менять publishDate и publishTime, отнимая разное
//    количество временных единиц
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Task1Timestamp {

    public static void main(String[] args) throws InterruptedException {
        System.out.print("Введите дату публикации: "); //печать сколько прошло времени
        String input = new Scanner(System.in).nextLine();
        processInput(input);
        System.out.println("Finish");
    }

    public static void processInput(String input) {
        try {
            LocalTime alarm = LocalTime.parse(input);

            for (int i = 0; i < 10000; i++) {
                Thread.sleep(1000L);
                LocalTime now = LocalTime.now();

                System.out.println(now);
                if (now.isAfter(alarm)) {
                    System.out.println("будим");

                    Toolkit.getDefaultToolkit().beep();
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("ex = " + ex.getMessage());
        }
        // Изучите класс Duration
    }

}
