package Homework9_IntermediateCertification.Task2WateringACactus;



import org.apache.commons.lang3.time.DateUtils;

import java.time.LocalDate;
import java.util.Date;

public class Sezon {
    // dateEndWatering - дата последнего полива.
    // определяем в каком сезоне была поливка
    public static boolean areDatesEqual(Date date1, Date date2) {
        // Организуем процедуру в порядок, чтобы избежать дублирования кода...
        boolean datesEqual = DateUtils.isSameDay(date1, date2);

        //или
        /**
         * Calendar cal1 = Calendar.getInstance();
         * Calendar cal2 = Calendar.getInstance();
         * cal1.setTime(date1);
         * cal2.setTime(date2);
         * cal1.set(Calendar.HOUR_OF_DAY, 0);
         * cal1.set(Calendar.MINUTE, 0);
         * cal1.set(Calendar.SECOND, 0);
         * cal1.set(Calendar.MILLISECOND, 0);
         * cal2.set(Calendar.HOUR_OF_DAY, 0);
         * // Повторите этот процесс для полей MINUTE, SECOND, MILLISECOND
         * boolean datesEqual = cal1.equals(cal2);
         */

        //Corp.bftcom.com
        //https://javarush.com/groups/posts/1941-kak-ne-poterjatjhsja-vo-vremeni--datetime-i-calendar
        //Calendar.JANUARY
        return true;
        // Реализуйте любой из предложенных ранее методов...
    }

    //public String dateEndWatering (LocalDate date){
      //  if (date>=LocalDate.)
    }
