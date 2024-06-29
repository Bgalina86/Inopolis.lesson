package Homework7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class PublishDateTime {

    private String inputTime;
    private String inputDate;
    private long inputDateMinut;
    private long inputTimeMinut;

    //Ввод даты публикации
    public String processDate() {
        System.out.print("Введите дату публикации: в формате yyyy MMM. dd: ");
        inputDate = new Scanner(System.in).nextLine();
        return inputDate;
    }

    //Ввод времени публикации
    public String processTime() {
        System.out.print("Введите время публикации: в формате HH:mm: ");
        inputTime = new Scanner(System.in).nextLine();

        return inputTime;
    }

    //Получаем дату в минутах
    public long publishDate(String inputDate) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy MMMM dd");
        Date dateInput = formatDate.parse(inputDate);
        this.inputDateMinut = dateInput.getTime() / 1000L / 60;
        return this.inputDateMinut;
    }

    //Получаем время в минутах
    public long publishTime(String inputTime) {
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime timeInput = LocalTime.parse(inputTime, formatTime);
        this.inputTimeMinut = timeInput.getHour() * 60 + timeInput.getMinute();
        return this.inputTimeMinut;
    }

    //Получаем сумму даты и времни в минутах публикации
    public long processDatePlusTime(long inputDateMinut, long inputTimeMinut) {
        long fullMinut = inputDateMinut + inputTimeMinut;
        //System.out.println("publishDateTime = " + fullMinut);

        return fullMinut;
    }
}
