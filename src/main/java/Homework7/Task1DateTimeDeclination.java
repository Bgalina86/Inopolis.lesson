package Homework7;
//Реализуйте интерфейс WateringPlanProba ссылка. Напишите функцию,
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

import java.text.ParseException;
import java.time.LocalDateTime;

public class Task1DateTimeDeclination {

    //private static long processDatePlusTime;

    private static void test1() throws ParseException {
        String sDateTime = "2024 июн. 28";
        String sTimeVal = "20:23";

//        long publishDate = (new PublishDateTime()).publishDate(sDateTime);
//        long publishTime = (new PublishDateTime()).publishTime(sTimeVal);
//
//        PublishDateTime pdt =  new PublishDateTime();
//        long fullMinut =  pdt.processDatePlusTime(publishDate, publishTime);

    }

    public static void main(String[] args) throws ParseException {//Ввод данных с клавиатуры
//        String  datePublish = new PublishDateTime().processDate();
//        String  timePublish = new PublishDateTime().processTime();
        //Тестовые данные
        String datePublish = "2024 июл. 03";
        String timePublish = "13:23";

        //Парсим дату и время в минуты
        long publishDate = (new PublishDateTime()).publishDate(datePublish);
        long publishTime = (new PublishDateTime()).publishTime(timePublish);

        //Суммируем распрсенное время и дату. Получаем общее значение в минутах
        PublishDateTime pdt = new PublishDateTime();
        long fullMinut = pdt.processDatePlusTime(publishDate, publishTime);
        //System.out.println("fullMinut = " + fullMinut);

        //Работа с интерфейсом. Определение локального времени
        LocalDateTimeMinut unixTime = new LocalDateTimeMinut();
        var ts = unixTime.getTimestamp(LocalDateTime.now());

        //Переводим локальное время в тип данных long
        //System.out.println("unixTime = " + ts);
        long currentDateTame = Long.parseLong(String.valueOf(ts));

        //System.out.println("unixTime = " + currentDateTame);
        //Проверка на граничные условия
        try {
            if (currentDateTame < fullMinut) {
                System.out.println(
                    "Время введенное больше текущего. Публикация не может быть опубликована в будущем. Введите корректную дату публикации");
            } else {
                long ageInMinutes = currentDateTame - fullMinut;
                //Переходим к склонению даты и времени
                Calculater.checkDateTime(ageInMinutes);
                System.out.print("назад была опубликована статья.");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
