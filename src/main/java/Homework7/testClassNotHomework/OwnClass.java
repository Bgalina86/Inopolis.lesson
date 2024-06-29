package Homework7.testClassNotHomework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class OwnClass {

    public static void main(String[] args) {
        //Вводимая дата публикации
        //День
        System.out.print("Введите дату публикации: в формате yyyy MMM. dd: ");
        String inputDate = "2024 июн. 29";
        SimpleDateFormat formatDate=new SimpleDateFormat("yyyy MMMM dd");
        Date dateInput = null;
        try {
            dateInput = formatDate.parse(inputDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("date1 = " + dateInput);

        long inputDateMinut=dateInput.getTime()/1000L/60;
        System.out.println("date1 = " + inputDateMinut);

        //Время
        System.out.print("Введите дату публикации: в формате HH:mm: ");
        String inputTime = "20:23";
        DateTimeFormatter formatTime= DateTimeFormatter.ofPattern("HH:mm");
        LocalTime timeInput = LocalTime.parse(inputTime,formatTime);
        System.out.println("timeInput = " + timeInput);

        long inputTimeMinut=timeInput.getHour()*60+timeInput.getMinute();
        System.out.println("inputTimeMinut = " + inputTimeMinut);

        long fullMinut = inputDateMinut+inputTimeMinut;

        //Вывод в минутах вводимой даты публикации
        System.out.println("fullMinut = " + fullMinut);

        // Определение текущей даты
        long unixTime = System.currentTimeMillis()/1000L/60;
        System.out.println("unixTime = " + unixTime);

        //Проверка на граничные условия
        if (unixTime<fullMinut){
            System.out.println("Время введеное больше текущего. Публикация не может быть опубликована в будущем. Введите корректную дату публикации");
        }

    }

}
