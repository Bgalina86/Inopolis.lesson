package Lesson8;

import java.time.LocalDate;
import javafx.util.converter.LocalDateTimeStringConverter;

public class DatesDemo {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date1=LocalDate.of(2024,2,10);
        System.out.println(date1);
        LocalDate date2=LocalDate.parse("2024-10-25");
        System.out.println(date2);
    }

}
