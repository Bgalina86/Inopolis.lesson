package Homework9_IntermediateCertification.Task2WateringACactus;
/**
 * Задание № 2 У программиста Васи на подоконнике растёт кактус. Вася постоянно забывает его
 * поливать, поэтому он купил датчик влажности и решил составить программу для отслеживания времени
 * полива.
 * <p>
 * На вход программа ждет дату последнего полива кактуса. Если сейчас зима (декабрь - февраль), то
 * кактус поливается раз в месяц. Если осень или весна - раз в неделю. Летом поливается в
 * зависимости от влажности воздуха, но не чаще одного раза в два дня.
 * <p>
 * Значение влажности воздуха в программу попадает автоматически от датчика (реализуйте через вызов
 * метода класса Датчик, внутри которого будет генерация рандомного числа). Если влажность меньше
 * 30%, кактус нужно полить.
 * <p>
 * Вася ожидает от программы, что после проверки всех данных, она выведет ему сообщение с датой,
 * когда надо поливать кактус.
 * <p>
 * Реализуйте программу, используя принципы ООП и библиотеки для работы с датой.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task2TimeToWater {

    public static void main(String[] args) {

        System.out.println("Введите дату последнего полива в формате dd.MM.yyyy: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        boolean isData = false;

        Scanner scanner = new Scanner(System.in);
        LocalDate lastWaterDate = null;

        do { //контроль ввода даты
            try {
                String inputDate = scanner.nextLine();
                lastWaterDate = LocalDate.parse(inputDate, formatter);
                isData = true;
            } catch (DateTimeParseException e) {
                System.out.println("Пожалуйста, введите дату в формате dd.MM.yyyy");
            }
        } while (!isData);

        WateringPlan myCactus = new Cactus("Кактус");
        LocalDate nextWaterDate = myCactus.waterPlants(lastWaterDate);
        System.out.println(nextWaterDate.format(formatter) + " - Дата следующего полива");
    }
}
