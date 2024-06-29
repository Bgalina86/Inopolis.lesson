package Homework7.testClassNotHomework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TaskTime {

    public static void main(String[] args) throws ParseException
    {
         //Вводимая дата публикации
        //День
        System.out.print("Введите дату публикации: в формате yyyy MMM. dd: ");
        String inputDate = new Scanner(System.in).nextLine();
        SimpleDateFormat formatDate=new SimpleDateFormat("yyyy MMMM dd");
        Date dateInput =formatDate.parse(inputDate);
        System.out.println("date1 = " + dateInput);

        long inputDateMinut=dateInput.getTime()/1000L/60;
        System.out.println("date1 = " + inputDateMinut);

        //Время
        System.out.print("Введите дату публикации: в формате HH:mm: ");
        String inputTime = new Scanner(System.in).nextLine();
       DateTimeFormatter formatTime= DateTimeFormatter.ofPattern("HH:mm");
        LocalTime timeInput = LocalTime.parse(inputTime,formatTime);
        // LocalDate date1 = LocalDate.of(2024, 2, 10);
        System.out.println("timeInput = " + timeInput);

        long inputTimeMinut=timeInput.getHour()*60+timeInput.getMinute();
        System.out.println("inputTimeMinut = " + inputTimeMinut);

       long fullMinut = inputDateMinut+inputTimeMinut;
       //Вывод в минутах вводимой даты пуликации
        System.out.println("fullMinut = " + fullMinut);

// Определение текущей даты



        long unixTime = System.currentTimeMillis()/1000L/60;
        System.out.println("unixTime = " + unixTime);
  //Проверка на граничные условия
if (unixTime<fullMinut){
    System.out.println("Время введеное больше текущего. Публикация не может быть опубликована в будущем. Введите корректную дату публикации");
}else {
    long differenceDateTime = unixTime-fullMinut;
    System.out.println(differenceDateTime + " минут");
}



    }

}
